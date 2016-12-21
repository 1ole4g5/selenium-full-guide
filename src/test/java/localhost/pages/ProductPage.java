package localhost.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Page {

	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="quantity>button")
    public WebElement addToCartButton;
	
	public void addToCartItem() {
		wait.until(textToBePresentInElementLocated(By.cssSelector(".quantity>button"), "Add To Cart"));
		addToCartButton.click();
		wait.until(textToBePresentInElementLocated(By.cssSelector("#cart .quantity"), "1"));
	}
}