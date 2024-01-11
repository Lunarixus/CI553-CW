package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Add or get products.
 *
 * @author  Nathan Brooke
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
  private static final long serialVersionUID = 1L;
  private List<Product> products;

  public BetterBasket() {
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  } // Add a product.

  public List<Product> getProducts() {
    return Collections.unmodifiableList(products);
  } // Get all products.

  public void clear() {
    products.clear();
  } // Clear all products.
}