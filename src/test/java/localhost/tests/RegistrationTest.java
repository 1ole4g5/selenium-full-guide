//package localhost.tests;
//
//import org.junit.*;
//import org.openqa.selenium.By;
//
//public class RegistrationTest extends TestBase {
//
//	@Test
//	public void testRegistrationTest() {
//		driver.get(baseUrl);
//		driver.findElement(By.cssSelector("#box-account-login a[href=\"http://localhost/litecart/en/create_account\"]")).click();
//		driver.findElement(By.cssSelector("#create-account input[name=\"firstname\"]")).sendKeys("firstname");
//		driver.findElement(By.cssSelector("#create-account input[name=\"lastname\"]")).sendKeys("lastname");
//		driver.findElement(By.cssSelector("#create-account input[name=\"address1\"]")).sendKeys("address1");
//		driver.findElement(By.cssSelector("#create-account input[name=\"postcode\"]")).sendKeys("123456");
//		driver.findElement(By.cssSelector("#create-account input[name=\"city\"]")).sendKeys("city");
//		driver.findElement(By.cssSelector("#create-account input[name=\"email\"]")).sendKeys("test@test.com");
//		driver.findElement(By.cssSelector("#create-account input[name=\"phone\"]")).sendKeys("1");
//		driver.findElement(By.cssSelector("#create-account input[name=\"password\"]")).sendKeys("password");
//		driver.findElement(By.cssSelector("#create-account input[name=\"confirmed_password\"]")).sendKeys("password");
//		driver.findElement(By.cssSelector("#create-account button[name=\"create_account\"]")).click();
//		
//		driver.findElement(By.cssSelector("#box-account a[href=\"http://localhost/litecart/en/logout\"]")).click();
//		
//		driver.findElement(By.cssSelector("#box-account-login input[name=\"email\"]")).sendKeys("test@test.com");
//		driver.findElement(By.cssSelector("#box-account-login input[name=\"password\"]")).sendKeys("password");
//		
//		driver.findElement(By.cssSelector("#box-account-login button[name=\"login\"]")).click();
//		
//		driver.findElement(By.cssSelector("#box-account a[href=\"http://localhost/litecart/en/logout\"]")).click();
//	}
//}