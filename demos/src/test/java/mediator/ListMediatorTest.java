package mediator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ListMediatorTest {

    @Test
    public void testAdd() {
        List<String> from = new ArrayList<>(Arrays.asList("Java", "JavaScript", "PHP", "Python"));
        List<String> to = new ArrayList<>();
        ListMediator listMediator = new ListMediator(from, to);

        listMediator.add("PHP");
        assertThat(listMediator.getFrom(), equalTo(Arrays.asList("Java", "JavaScript", "Python")));
        assertThat(listMediator.getTo(), equalTo(Arrays.asList("PHP")));
    }
}
