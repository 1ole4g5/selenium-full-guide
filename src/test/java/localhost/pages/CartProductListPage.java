package localhost.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartProductListPage extends Page {

	public CartProductListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="button[value=Remove]")
    public WebElement removeButton;
	
	public void deleteAllProductsFromCart() {
		for (int j = 0; j < driver.findElements(By.cssSelector("button[value=Remove]")).size(); j++) {
			wait.until(textToBePresentInElementLocated(By.cssSelector("button[value=Remove]"), "Remove"));
			removeButton.click();
			wait.until(stalenessOf(driver.findElement(By.cssSelector("#order_confirmation-wrapper"))));
		}
	}
}