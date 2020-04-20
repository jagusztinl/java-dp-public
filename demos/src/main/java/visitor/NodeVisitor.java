package visitor;

public interface NodeVisitor {

    void visit(Employee employee);

    void visit(Unit unit);
}
