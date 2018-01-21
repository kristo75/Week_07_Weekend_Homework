import Instruments.Guitar;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Silver", Type.BRASS, 250, 799, 6);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberStrings());
    }



}
