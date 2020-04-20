package lightweight;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class MonthlyPayDetailsTest {

    @Test
    public void testGetInstance() {
        MonthlyPayDetails details = MonthlyPayDetails.getInstance(100);
        assertThat(details.pay(), equalTo(100d));

        MonthlyPayDetails another = MonthlyPayDetails.getInstance(100);
        assertThat(another.pay(), equalTo(100d));

        assertThat(details == another, equalTo(true));
    }
}
