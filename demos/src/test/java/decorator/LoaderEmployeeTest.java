package decorator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class LoaderEmployeeTest {

    @Test
    public void testLoad() {
        Employee employee = new EmployeeImpl(0, null);
        LoaderEmployee loaderEmployee = new LoaderEmployee(employee);
        loaderEmployee.load("11;John Doe");
        Employee another = loaderEmployee;
        assertThat(another.getId(), equalTo(11L));
        assertThat(another.getName(), equalTo("John Doe"));
    }
}
