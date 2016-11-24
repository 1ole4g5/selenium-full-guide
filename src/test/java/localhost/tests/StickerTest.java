//package localhost.tests;
//
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
//		driver.get(baseUrl);
//		List<WebElement> elements = driver.findElements(By.cssSelector(".content .link"));
//
//		for (int i = 0; i < elements.size(); i++) {
//			driver.findElements(By.cssSelector(".sticker"));
//			
//				System.out.println(driver.findElements(By.cssSelector(".content .link .sticker")).size());
//				
//			System.out.println(driver.findElements(By.cssSelector(".content .link .sticker")).size());
//		}
//	}
//}