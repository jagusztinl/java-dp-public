package composite;

import java.util.List;

public class Search {

    public void find(List<String> names, Node node) {
        if (node.getName().startsWith("a")) {
            names.add(node.getName());
        }
        for (Node child: node.getChildren()) {
            find(names, child);
        }
    }
}
