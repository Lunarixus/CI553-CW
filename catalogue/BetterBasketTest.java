package catalogue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BetterBasketTest {
    private BetterBasket betterBasket;
    private Product apple;
    private Product banana;

    @Before
    public void setUp() {
        betterBasket = new BetterBasket();
        apple = new Product("A123", "Apple", 1.0, 10);
        banana = new Product("B456", "Banana", 0.75, 15);
    }

    @Test
    public void testAddProduct() {
        betterBasket.addProduct(apple);
        betterBasket.addProduct(banana);

        assertEquals(2, betterBasket.getProducts().size());
        assertTrue(betterBasket.getProducts().contains(apple));
        assertTrue(betterBasket.getProducts().contains(banana));
    }

    @Test
    public void testClear() {
        betterBasket.addProduct(apple);
        betterBasket.addProduct(banana);

        assertEquals(2, betterBasket.getProducts().size());

        betterBasket.clear();

        assertEquals(0, betterBasket.getProducts().size());
    }

    // Add more tests as needed for your assignment
}