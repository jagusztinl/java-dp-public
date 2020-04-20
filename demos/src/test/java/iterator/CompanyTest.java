package iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class CompanyTest {

    @Test
    public void testIterate() {
        Company company = new Company();
        company.addEmployee(new Employee("John Doe"));
        company.addEmployee(new Employee("Jane Doe"));
        company.addEmployee(new Employee("Jack Doe"));

        List<String> names = new ArrayList<>();
        for (Employee employee: company) {
            names.add(employee.getName());
        }
        assertThat(names,equalTo(Arrays.asList("John Doe", "Jane Doe", "Jack Doe")));
    }
}
