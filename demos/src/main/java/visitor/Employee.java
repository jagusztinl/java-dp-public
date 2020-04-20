package visitor;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Node {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Node> getChildren() {
        return new ArrayList<>();
    }
}
