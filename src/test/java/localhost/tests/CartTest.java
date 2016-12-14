package localhost.tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;
import org.junit.*;
import org.openqa.selenium.By;

public class CartTest extends TestBase {

	@Test
	public void testCartTest() {
		driver.navigate().to(baseUrl);

		for (int i = 0; i < 4; i++) {

			driver.findElements(By.cssSelector("#box-most-popular .link")).get(i).click();

			wait.until(textToBePresentInElementLocated(By.cssSelector(".quantity>button"), "Add To Cart"));

			driver.findElement(By.cssSelector(".quantity>button")).click();

			wait.until(textToBePresentInElementLocated(By.cssSelector("#cart .quantity"), String.valueOf(i)));

			driver.navigate().back();

			wait.until(textToBePresentInElementLocated(By.cssSelector("#box-most-popular .link"), "Duck"));
		}

		driver.findElement(By.cssSelector("#cart .quantity")).getText();
		System.out.println(driver.findElement(By.cssSelector("#cart .quantity")).getText());

		driver.findElement(By.cssSelector(".link[href$=checkout]")).click();
		wait.until(titleIs("Checkout | My Store"));
		System.out.println(driver.getTitle());

		for (int j = 0; j < driver.findElements(By.cssSelector("button[value=Remove]")).size(); j++) {
			wait.until(textToBePresentInElementLocated(By.cssSelector("button[value=Remove]"), "Remove"));
			driver.findElement(By.cssSelector("button[value=Remove]")).click();
			wait.until(stalenessOf(driver.findElement(By.cssSelector("#order_confirmation-wrapper"))));
		}

	}
}