package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNewWindow extends PageUtility {
	
	public WebDriver driver;
	
	public PageNewWindow(WebDriver driver) {
		super(driver);
		this.driver = driver;
	
	}

	//Page Elements
	
	@FindBy(xpath ="//a[normalize-space()='Click Here']")
	private WebElement clickHere;
	
	//Page Actions
	public PageNewWindowFinal clickHereClk() {
		clickLink(clickHere);
		return new PageNewWindowFinal(driver);
		
	}
	
}
