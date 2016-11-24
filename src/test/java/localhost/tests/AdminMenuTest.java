package localhost.tests;

import java.util.List;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminMenuTest extends TestBase {

	@Test
	public void testAdminMenuTest() {
		driver.navigate().to(baseUrl + "admin");
		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		for (int i = 0; i < driver.findElements(By.cssSelector("#box-apps-menu>li")).size(); i++) {
			List<WebElement> myElements = driver.findElements(By.cssSelector("#box-apps-menu>li"));
			myElements.get(i).click();
			driver.findElement(By.cssSelector("#content>h1"));

			if (driver.findElements(By.cssSelector(".docs li")).size() > 0) {
				for (int j = 0; j < driver.findElements(By.cssSelector(".docs li")).size(); j++) {
					List<WebElement> myEl2 = driver.findElements(By.cssSelector(".docs li"));
					myEl2.get(j).click();
					driver.findElement(By.cssSelector("#content>h1"));
				}
			}

		}
	}
}