package chainofresponsibility;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeChainTest {

    @Test
    public void testFinish() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe", w -> false),
                        new Employee("Jack Doe", w -> true),
                        new Employee("Jane Doe", w -> false)
                );
        EmployeeChain chain = new EmployeeChain(employees);

        Work work = new Work("Work 1");
        chain.finish(work);

        assertThat(work.isFinished(), equalTo(true));
        assertThat(work.getEmployee().getName(), equalTo("Jack Doe"));
    }
}
