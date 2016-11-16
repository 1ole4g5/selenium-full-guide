package localhost.tests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public WebDriver driver;
	public WebDriverWait wait;
	public String baseUrl;

	@Before
	public void start() {
		driver = new ChromeDriver();
		baseUrl = "http://localhost/litecart/admin";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void stop() {
		driver.quit();
		driver = null;
	}
}