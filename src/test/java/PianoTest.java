import Instruments.Piano;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", Type.KEYBOARD, 1000.00, 3000.00, 88);
    }



    @Test
    public void getType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void setType() {
        piano.setType(Type.KEYBOARD);
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void getNumberKeys(){
        assertEquals(88, piano.getNumberKeys());
    }
}
