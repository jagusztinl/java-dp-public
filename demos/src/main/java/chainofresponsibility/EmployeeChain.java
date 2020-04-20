package chainofresponsibility;

import java.util.List;

public class EmployeeChain {

    private List<Employee> employees;

    public EmployeeChain(List<Employee> employees) {
        this.employees = employees;
    }

    public void finish(Work work) {
        for (Employee employee: employees) {
            if (employee.canFinish(work)) {
                work.finish(employee);
                return;
            }
        }
    }
}
