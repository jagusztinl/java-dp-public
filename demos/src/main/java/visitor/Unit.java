package visitor;

import java.util.ArrayList;
import java.util.List;

public class Unit implements Node {

    private String name;

    private List<Node> children = new ArrayList<>();

    public Unit(String name) {
        this.name = name;
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
        children.forEach(n -> n.visit(nodeVisitor));
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
        return children;
    }


}
