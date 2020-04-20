package lightweight;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringTest {

    @Test
    public void testStringEquals() {
        String s1 = new String("foo");
        String s2 = new String("foo");

        assertTrue("bar" == "bar");
        assertFalse(new String("foo") == new String("foo"));
        assertTrue(s1.equals(s2));

        Integer i1 = 12;
        Integer i2 = 12;

        assertTrue(i1 == i2);

        Integer i3 = 1200;
        Integer i4 = 1200;

        assertFalse(i3 == i4);
    }
}
