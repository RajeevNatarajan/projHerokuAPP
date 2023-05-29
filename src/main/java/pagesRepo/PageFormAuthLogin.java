package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFormAuthLogin extends PageUtility {
	
	public WebDriver driver;
	
	public PageFormAuthLogin (WebDriver driver) {
		super(driver);
		this.driver= driver;
	}

	//Page elements
	
	@FindBy(xpath="//a[normalize-space()='Form Authentication']")
	private WebElement formAuthLink;
	
	//Page Actions
	
	public PageFormAuthLoginFinal FormAuthLinkclick() {
		clickLink(formAuthLink);
		return new PageFormAuthLoginFinal(driver);
	}
	
}
