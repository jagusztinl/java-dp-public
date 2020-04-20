package interpreter;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeRendererTest {

    @Test
    public void testRender() {
        EmployeeRenderer renderer = new EmployeeRenderer();
        String result = renderer.render(Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe")
        ));

        assertThat(result, equalTo("<ul><li><span >John Doe</span></li><li><span >Jane Doe</span></li></ul>"));
    }
}
