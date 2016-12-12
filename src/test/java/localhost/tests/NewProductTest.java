package localhost.tests;

import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.By;

public class NewProductTest extends TestBase {
		
	@Test
	public void testNewProductTest() {
		driver.navigate().to(baseUrl + "admin/");
		
		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		driver.findElement(By.xpath(".//td[1]/div[3]/ul/li[2]/a")).click();
		
		driver.findElement(By.cssSelector("a[href$=\"&doc=edit_product\"]")).click();
		
		driver.findElement(By.cssSelector("input[name=\"name[en]\"]")).sendKeys("name");
		
		driver.findElement(By.cssSelector(".button-set>button[name=save]")).click();
		
		String newElement = driver.findElement(By.cssSelector("a[href*=\"doc=edit_product&category_id=0&product_id\"]:not([title=\"Edit\"])")).getText();
		
		assertEquals(newElement, "name");			
	}
}