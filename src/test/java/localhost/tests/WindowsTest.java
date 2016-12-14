package localhost.tests;

import java.util.Set;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WindowsTest extends TestBase {

	@Test
	public void testWindowsTest() {
		driver.navigate().to(baseUrl + "admin/?app=countries&doc=countries");
		
		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		driver.findElement(By.cssSelector("#content .button")).click();

		for (int i = 0; i < 7; i++) {
			String mainWindow = driver.getWindowHandle();
			Set<String> existingWindow = driver.getWindowHandles();
			driver.findElements(By.cssSelector(".fa.fa-external-link")).get(i).click();
			String newWindow = wait.until(thereIsWindowOtherThan(existingWindow));
			driver.switchTo().window(newWindow);
			driver.close();
			driver.switchTo().window(mainWindow);
		}

	}

	public ExpectedCondition<String> thereIsWindowOtherThan(Set<String> existingWindow) {
		return driver -> {
			Set<String> handles = driver.getWindowHandles();
			handles.removeAll(existingWindow);
			return handles.size() > 0 ? handles.iterator().next() : null;
		};
	}
}