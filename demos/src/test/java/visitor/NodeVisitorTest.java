package visitor;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class NodeVisitorTest {

    private Unit unit;

    @Before
    public void init() {
        unit = new Unit("Organization");

        Unit dep1 = new Unit("a dep");
        Unit dep2 = new Unit("b dep");

        unit.getChildren().add(dep1);
        unit.getChildren().add(dep2);

        Unit team1 = new Unit("a team");
        Unit team2 = new Unit("b team");

        dep1.getChildren().add(team1);
        dep1.getChildren().add(team2);

        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("Jack Doe");

        team1.getChildren().add(emp1);
        team1.getChildren().add(emp2);
    }

    @Test
    public void testVisit() {
        NameNodeVisitor visitor = new NameNodeVisitor();
        unit.visit(visitor);
        String result = visitor.toString();

        assertThat(result, equalTo("ORGANIZATION A DEP A TEAM John Doe Jack Doe B TEAM B DEP "));
    }

    @Test
    public void testToUpperCase() {
        ToUpperCaseVisitor visitor = new ToUpperCaseVisitor();
        unit.visit(visitor);

        assertThat(unit.getName(), equalTo("ORGANIZATION"));
        assertThat(unit.getChildren().get(0).getName(), equalTo("A DEP"));
    }
}
