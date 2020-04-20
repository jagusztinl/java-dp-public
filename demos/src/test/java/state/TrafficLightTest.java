package state;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class TrafficLightTest {

    @Test
    public void testNext() {
        TrafficLight light = TrafficLight.RED;
        light = light.next();

        assertThat(light, equalTo(TrafficLight.RED_YELLOW));
    }
}
