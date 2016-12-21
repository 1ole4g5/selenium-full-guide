//package localhost.tests;
//
//import static org.junit.Assert.assertTrue;
//import java.util.List;
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//public class StickerTest extends TestBase {
//
//	@Test
//	public void testStikerTest() {
//		driver.navigate().to(baseUrl);
//		List<WebElement> products = driver.findElements(By.cssSelector(".content .product"));
//
//		for (WebElement webElement : products) {
//			assertTrue(webElement.findElements(By.cssSelector(".sticker")).size() == 1);
//		}
//
//	}
//}