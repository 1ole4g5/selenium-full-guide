package localhost.app;

import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import localhost.pages.CartProductListPage;
import localhost.pages.ProductListPage;
import localhost.pages.ProductPage;

public class Application {

	private WebDriver driver;
	public ProductListPage productListPage;
	public ProductPage productPage;
	public CartProductListPage cartProductListPage;

	public Application() {
		driver = new ChromeDriver();
		productListPage = new ProductListPage(driver);
		productPage = new ProductPage(driver);
		cartProductListPage = new CartProductListPage(driver);
		System.out.println(((HasCapabilities) driver).getCapabilities());
	}

	public void quit() {
		driver.quit();
	}
}