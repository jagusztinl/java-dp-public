package visitor;

public class NameNodeVisitor implements NodeVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Employee employee) {
        sb.append(employee.getName()).append(" ");
    }

    @Override
    public void visit(Unit unit) {
        sb.append(unit.getName().toUpperCase()).append(" ");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
