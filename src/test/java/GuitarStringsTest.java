import Shop.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Yamaha", 12.95, 19.95, "Beginners");

    }


    @Test
    public void canGetLevel() {
        assertEquals("Beginners", guitarStrings.getLevel());
    }
}