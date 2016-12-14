package localhost.tests;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;

public class BrowserLogTest extends TestBase {

	@Test
	public void testBrowserLogTest() {
		driver.navigate().to(baseUrl + "admin/?app=catalog&doc=catalog&category_id=1");

		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		for (int i = 0; i < driver.findElements(By.cssSelector("a[href*=\"&product_id=\"]:not([title=\"Edit\"])"))
				.size(); i++) {
			List<WebElement> webElements = driver.findElements(By.cssSelector("a[href*=\"&product_id=\"]:not([title=\"Edit\"])"));
			webElements.get(i).click();

			for (LogEntry l : driver.manage().logs().get("browser").getAll()) {
				if (l.getMessage().equals("")) {
					System.out.println(l + "There aren't any errors in the log");
				} else {
					System.out.println(l + "There are an errors in the log");
				}
			}

			driver.navigate().back();
		}
	}
}