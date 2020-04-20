package visitor;

import java.util.List;

public interface Node {

    String getName();

    List<Node> getChildren();

    void visit(NodeVisitor nodeVisitor);
}
