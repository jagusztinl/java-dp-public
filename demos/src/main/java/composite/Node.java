package composite;

import java.util.List;

public interface Node {

    String getName();

    List<Node> getChildren();
}
