package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Employee {

    private String name;

    private long salary;

    private List<EmployeeObserver> observers = new ArrayList<>();

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void register(EmployeeObserver observer) {
        observers.add(observer);
    }

    public void remove(EmployeeObserver observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        observers.stream().forEach(o -> o.nameHasChanged(oldName, name));
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
