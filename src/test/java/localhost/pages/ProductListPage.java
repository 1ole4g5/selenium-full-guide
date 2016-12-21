package localhost.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends Page {

	public ProductListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public ProductListPage open() {
		driver.navigate().to("http://localhost/litecart/");
		return this;
	}

	@FindBy(css="#box-most-popular .link")
	public WebElement productItems;
	
	public ProductListPage chooseProduct() {
		
		productItems.click();
		return this;
	}

	@FindBy(css=".link[href$=checkout]")
    public WebElement checkOutLink;
	
	public void openCart() {
		checkOutLink.click();
		wait.until(titleIs("Checkout | My Store"));
	}
}