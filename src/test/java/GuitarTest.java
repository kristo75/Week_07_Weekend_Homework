import Instruments.Guitar;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red", Type.STRINGS, 250.00, 1000.00, 6);
    }

    @Test
    public void getColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void setColour() {
        guitar.setColour("Green");
        assertEquals("Green", guitar.getColour());
    }
    @Test
    public void getBuy_price() {
        assertEquals(250.00, guitar.getBuyPrice(), 00.1);
    }

    @Test
    public void setBuyPrice() {
        guitar.setBuyPrice(300);
        assertEquals(300, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void getNumberStrings(){
        assertEquals(6, guitar.getNumberStrings());
    }

    @Test
    public void instrumentCanPlay(){
        assertEquals(guitar.play(), "Strum");
    }

}
