package localhost.tests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.selenium.factory.WebDriverPool;

public class TestBase {
	public WebDriver driver;
	public WebDriverWait wait;
	public String baseUrl;

	@Before
	public void startBrowser() {
		driver = WebDriverPool.DEFAULT.getDriver(DesiredCapabilities.chrome());
		baseUrl = "http://localhost/litecart/";
		System.out.println(((HasCapabilities) driver).getCapabilities());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10/*seconds*/);
	}

	@After
	public void stopAllBrowsers() {
		WebDriverPool.DEFAULT.dismissAll();
	}
}