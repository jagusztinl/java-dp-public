package singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeDaoTest {

    @Test
    public void testGetInstance() {
        EmployeeDao employeeDao = EmployeeDao.getInstance();

        EmployeeDao another = EmployeeDao.getInstance();

        assertThat(employeeDao, equalTo(another));
    }
}
