package localhost.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SortTest extends TestBase {

	@Test
	public void testSortTest() {
		driver.navigate().to(baseUrl + "admin/?app=countries&doc=countries");
		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		List<WebElement> countries = driver.findElements(By.cssSelector("a[href*=\"edit_country&country_code\"]:not([title=\"Edit\"])"));

		ArrayList<String> unSortedArrList = new ArrayList<>();
		ArrayList<String> sortedArrList = new ArrayList<>();

		for (WebElement webElement : countries) {
			String countriesText = webElement.getText();
			unSortedArrList.add(countriesText);
			sortedArrList.add(countriesText);
		}

		Collections.sort(sortedArrList);

		assertEquals("Two lists aren't the same", unSortedArrList, sortedArrList);

		// the second part of test:
		for (int i = 0; i < driver.findElements(By.cssSelector(".row")).size(); i++) {

			List<WebElement> rowsList = driver.findElements(By.cssSelector(".row"));

			if (!(rowsList.get(i).findElement(By.cssSelector("td:nth-child(6)")).getText()).equals("0")) {
				rowsList.get(i).findElement(By.cssSelector("a")).click();

				List<WebElement> countries2 = driver.findElements(By.cssSelector("[name$='[name]'][type='hidden']"));
				
				ArrayList<String> unSortedArrList2 = new ArrayList<>();
				ArrayList<String> sortedArrList2 = new ArrayList<>();
				
				for (WebElement webElement2 : countries2) {
					String countriesText = webElement2.getAttribute("value");
					unSortedArrList2.add(countriesText);
					sortedArrList2.add(countriesText);
				}

				Collections.sort(sortedArrList2);

				assertEquals("Two lists aren't the same", unSortedArrList2, sortedArrList2);

				driver.navigate().back();
			}
		}
	}

	@Test
	public void testSort2Test() {
		driver.navigate().to(baseUrl + "admin/?app=geo_zones&doc=geo_zones");
		driver.findElement(By.cssSelector("#box-login input[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login input[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("#box-login button[name=login]")).click();

		ArrayList<String> unSortedArrList = new ArrayList<>();
		ArrayList<String> sortedArrList = new ArrayList<>();

		driver.get("http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones");

		for (int j = 0; j < driver.findElements(By.cssSelector("a[href*=\"edit_geo_zone&page=1&geo_zone_id\"]:not([title=\"Edit\"])")).size(); j++) {
			List<WebElement> editGeoZoneslist = driver.findElements(By.cssSelector("a[href*=\"edit_geo_zone&page=1&geo_zone_id\"]:not([title=\"Edit\"])"));
			editGeoZoneslist.get(j).click();

			for (int k = 0; k < driver.findElements(By.cssSelector("#table-zones [name*=zone_code]")).size(); k++) {
				List<WebElement> geoZonesList = driver.findElements(By.cssSelector("#table-zones [name*=zone_code]"));
				geoZonesList.get(k).findElement(By.cssSelector("[selected]")).getAttribute("innerText");

				unSortedArrList.add(geoZonesList.get(k).findElement(By.cssSelector("[selected]")).getText());
				sortedArrList.add(geoZonesList.get(k).findElement(By.cssSelector("[selected]")).getText());

				assertEquals("Two lists aren't the same", unSortedArrList, sortedArrList);

			}

			driver.navigate().back();
		}
	}
}