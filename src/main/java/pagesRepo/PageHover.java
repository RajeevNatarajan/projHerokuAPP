package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHover extends PageUtility {

	public WebDriver driver;
	
	public PageHover(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	// Page Elements
	
	@FindBy(xpath="//a[normalize-space()='Hovers']")
	private WebElement hoverClk;
	
	//Page Actions
	public PageHoverFinal hoverClick() {
		clickLink(hoverClk);
		return new PageHoverFinal(driver);
	}
}
