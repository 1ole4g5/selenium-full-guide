package localhost.tests;

import org.junit.*;
import org.openqa.selenium.By;

public class LogInTest extends TestBase {

	@Test
	public void testLogInTest() {
		driver.navigate().to(baseUrl);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}
}