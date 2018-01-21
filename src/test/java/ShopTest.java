
import Shop.DrumSticks;
import Shop.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    GuitarStrings guitarStrings;
    DrumSticks drumSticks;

    @Before
    public void before (){
        drumSticks = new DrumSticks("Drum Sticks", 5, 10, "Wood");
        guitarStrings = new GuitarStrings("Guitar Strings", 10, 20, "Advanced");
    }

    @Test
    public void canAddStock(){
        drumSticks.addStock(drumSticks);
        assertEquals(drumSticks.stockCount(), 1);
    }

    @Test
    public void canRemoveStock(){
        guitarStrings.removeStock(guitarStrings);
        assertEquals(guitarStrings.stockCount(),0);
    }




}
