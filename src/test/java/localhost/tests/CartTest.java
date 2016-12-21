package localhost.tests;

import org.junit.*;

public class CartTest extends TestBase {

	@Test
	public void testCartTest() {

		app.productListPage.open().chooseProduct();
		app.productPage.addToCartItem();
		app.cartProductListPage.deleteAllProductsFromCart();
	}
}