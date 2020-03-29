import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
     guitar = new Guitar("Grand", 12, 25, 6);
    }


    @Test
    public void CanCalculateMarkup(){
        assertEquals(13, guitar.calculateMarkup());
    }
}
