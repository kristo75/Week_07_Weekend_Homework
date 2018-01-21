import Shop.Accessories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessories accessories;


    @Before
    public void before(){
        accessories = new Accessories("Guitar Strings", 8.95, 16.95);
    }

    @Test
    public void getProductName(){
        assertEquals("Guitar Strings", accessories.getProductName());
    }



    @Test
    public void getBuyPrice() {
        assertEquals(8.95, accessories.getBuyPrice(), 0.01);

    }

    @Test
    public void getSellPrice() {
        assertEquals(16.95, accessories.getSellPrice(),0.01);
    }


}
