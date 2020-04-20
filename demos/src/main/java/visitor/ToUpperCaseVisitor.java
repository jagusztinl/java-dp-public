package visitor;

public class ToUpperCaseVisitor implements NodeVisitor {

    @Override
    public void visit(Employee employee) {
        employee.setName(employee.getName().toUpperCase());
    }

    @Override
    public void visit(Unit unit) {
        unit.setName(unit.getName().toUpperCase());
    }
}
