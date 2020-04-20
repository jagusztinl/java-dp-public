package decorator;

public class UnmodifiableEmployee implements Employee {

    private Employee employee;

    public UnmodifiableEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public long getId() {
        return employee.getId();
    }

    @Override
    public void setId(long id) {
        throw new UnsupportedOperationException("Unmodifiable");
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Unmodifiable");
    }
}
