package decorator;

public class LoaderEmployee implements Employee {

    private Employee employee;

    public LoaderEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public long getId() {
        return employee.getId();
    }

    @Override
    public void setId(long id) {
        employee.setId(id);
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void setName(String name) {
        employee.setName(name);
    }

    public void load(String s) {
        String[] parts = s.split(";");
        employee.setId(Long.parseLong(parts[0]));
        employee.setName(parts[1]);
    }
}
