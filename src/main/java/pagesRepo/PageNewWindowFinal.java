package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageNewWindowFinal extends PageUtility {
	public WebDriver driver;
	public PageNewWindowFinal(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	// Page Elements
	
	@FindBy(xpath="//h3[normalize-space()='New Window']")
	private WebElement newWindow;
	
	//Page Actions
	
	public String newWindowChk() {
		return getText(newWindow);
		
		
	}
	
}
