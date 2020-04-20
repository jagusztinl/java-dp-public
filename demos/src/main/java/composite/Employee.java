package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Node {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Node> getChildren() {
        return new ArrayList<>();
    }
}
