package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * A basket that allows adding, retrieving, and managing products.
 * Extends the {@link Basket} class and implements {@link Serializable}.
 * Provides methods to add products, retrieve all products, and clear the basket.
 *
 * @author Nathan Brooke
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
  /**
   * A list to hold the products in the basket.
   */
  private List<Product> products;

  /**
   * Constructs an empty {@code BetterBasket}.
   */
  public BetterBasket() {
    this.products = new ArrayList<>();
  }

  /**
   * Adds a product to the basket.
   *
   * @param product the {@link Product} to add to the basket.
   */
  public void addProduct(Product product) {
    products.add(product);
  }

  /**
   * Retrieves an unmodifiable list of all products in the basket.
   *
   * @return a {@link List} of {@link Product} objects currently in the basket.
   */
  public List<Product> getProducts() {
    return Collections.unmodifiableList(products);
  }

  /**
   * Clears all products from the basket.
   * After calling this method, the basket will be empty.
   */
  public void clear() {
    products.clear();
  }
}
