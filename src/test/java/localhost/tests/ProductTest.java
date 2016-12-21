//package localhost.tests;
//
//import static org.junit.Assert.*;
//
//import org.junit.*;
//import org.openqa.selenium.By;
//
//public class ProductTest extends TestBase {
//		
//	@Test
//	public void testProductTest() {
//		driver.navigate().to(baseUrl);
//		
//		String grayColor = "rgba(119, 119, 119, 1)";
//		String grayColor2 = "rgba(102, 102, 102, 1)";
//		String smallText = "14.4px";
//		String smallText2 = "16px";
//		String strikeText = "S";
//		
//		String redColor = "rgba(204, 0, 0, 1)";
//		String strongText = "STRONG";
//		String boldText = "bold";
//		
//		String productNameMainPage = driver.findElement(By.cssSelector("#box-campaigns .name")).getText();		
//		String productFirstPriceMainPage = driver.findElement(By.cssSelector("#box-campaigns .regular-price")).getText();
//		String productFirstPriceColorMainPage = driver.findElement(By.cssSelector("#box-campaigns .regular-price")).getCssValue("color");		
//		String productFirstPriceFontSizeMainPage = driver.findElement(By.cssSelector("#box-campaigns .regular-price")).getCssValue("font-size");
//		String productFirstPriceStrikeTextMainPage = driver.findElement(By.cssSelector("#box-campaigns .regular-price")).getAttribute("tagName");
//		
//		String productSecondPriceMainPage = driver.findElement(By.cssSelector("#box-campaigns .campaign-price")).getText();
//		String productSecondPriceColorMainPage = driver.findElement(By.cssSelector("#box-campaigns .campaign-price")).getCssValue("color");		
//		String productSecondPriceFontWeightMainPage = driver.findElement(By.cssSelector("#box-campaigns .campaign-price")).getCssValue("font-weight");
//		String productSecondPriceStrongTextMainPage = driver.findElement(By.cssSelector("#box-campaigns .campaign-price")).getAttribute("tagName");
//		
//		driver.findElement(By.cssSelector("#box-campaigns .link")).click();
//		
//		String productNameSubCategoryPage = driver.findElement(By.cssSelector("#box-product h1")).getText();
//		String productFirstPriceSubCategoryPage = driver.findElement(By.cssSelector("#box-product .regular-price")).getText();		
//		String productFirstPriceColorSubCategoryPage = driver.findElement(By.cssSelector("#box-product .regular-price")).getCssValue("color");
//		String productFirstPriceFontSizeSubCategoryPage = driver.findElement(By.cssSelector("#box-product .regular-price")).getCssValue("font-size");
//		String productFirstPriceStrikeTextSubCategoryPage = driver.findElement(By.cssSelector("#box-product .regular-price")).getAttribute("tagName");
//
//		String productSecondPriceSubCategoryPage = driver.findElement(By.cssSelector("#box-product .campaign-price")).getText();
//		String productSecondPriceColorSubCategoryPage = driver.findElement(By.cssSelector("#box-product .campaign-price")).getCssValue("color");		
//		String productSecondPriceFontWeightSubCategoryPage = driver.findElement(By.cssSelector("#box-product .campaign-price")).getCssValue("font-weight");
//		String productSecondPriceStrongTextSubCategoryPage = driver.findElement(By.cssSelector("#box-product .campaign-price")).getAttribute("tagName");
//		
//		assertEquals(productNameMainPage, productNameSubCategoryPage);		
//		assertEquals(productFirstPriceMainPage, productFirstPriceSubCategoryPage);
//		assertEquals(productSecondPriceMainPage, productSecondPriceSubCategoryPage);
//		
//		assertEquals(productFirstPriceColorMainPage, grayColor);
//		assertEquals(productFirstPriceStrikeTextMainPage, strikeText);
//		assertEquals(productFirstPriceFontSizeMainPage, smallText);
//		
//		assertEquals(productSecondPriceColorMainPage, redColor);
//		assertEquals(productSecondPriceStrongTextMainPage, strongText);
//		assertEquals(productSecondPriceFontWeightMainPage, boldText);
//		
//		assertEquals(productFirstPriceColorSubCategoryPage, grayColor2);
//		assertEquals(productFirstPriceStrikeTextSubCategoryPage, strikeText);
//		assertEquals(productFirstPriceFontSizeSubCategoryPage, smallText2);
//		
//		assertEquals(productSecondPriceColorSubCategoryPage, redColor);
//		assertEquals(productSecondPriceStrongTextSubCategoryPage, strongText);
//		assertEquals(productSecondPriceFontWeightSubCategoryPage, boldText);	
//	}
//}