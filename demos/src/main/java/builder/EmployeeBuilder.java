package builder;

public class EmployeeBuilder {

    private String name;

    private double base = 800;

    private int hours;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public EmployeeBuilder setHours(int hours) {
        this.hours = hours;
        return this;
    }

    public Employee build() {
        if (name == null) {
            throw new IllegalStateException("Name is required");
        }
        Employee employee = new Employee(name, new HourlyPayDetails(base, hours));
        return employee;
    }
}
