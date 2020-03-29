import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop  shop;
    Piano  piano;
    Guitar  guitar;
    DrumSticks drumsticks;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano("Piano", 1200, 4000, 88);
        guitar = new Guitar("Guitar", 200,600, 6);
        drumsticks = new DrumSticks("Drum Sticks", 2, 4, "wood");

    }

    @Test
    public void canAddToStock(){
        shop.addToStock(piano);
        assertEquals(1, shop.getStock().size());
    }
    @Test
    public void canRemoveFromStock(){
        shop.addToStock(piano);

        shop.removeFromStock(piano);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalMarkup(){
        shop.addToStock(piano);
        shop.addToStock(guitar);
        shop.addToStock(drumsticks);
        assertEquals(3202, shop.fullStockMarkup());
    }

}
