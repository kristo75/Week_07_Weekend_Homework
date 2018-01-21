import Shop.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks= new DrumSticks("Drum Sticks", 8.95, 16.95, "Wood");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", drumSticks.getMaterial());
    }
}
