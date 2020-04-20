package composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class SearchTest {

    @Test
    public void testSearch() {
        Unit unit = new Unit("Organization");

        Unit dep1 = new Unit("a dep");
        Unit dep2 = new Unit("b dep");

        unit.getChildren().add(dep1);
        unit.getChildren().add(dep2);

        Unit team1 = new Unit("a team");
        Unit team2 = new Unit("b team");

        dep1.getChildren().add(team1);
        dep1.getChildren().add(team2);

        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("a Doe");

        team1.getChildren().add(emp1);
        team1.getChildren().add(emp2);

        List<String> names = new ArrayList<>();
        new Search().find(names, unit);
        assertThat(names, equalTo(Arrays.asList("a dep", "a team", "a Doe")));

    }
}
