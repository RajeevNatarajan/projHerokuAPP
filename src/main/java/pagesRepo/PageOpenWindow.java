package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOpenWindow extends PageUtility {
	public WebDriver driver;
	
	public PageOpenWindow(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Page Elements
	
	@FindBy(xpath = "//a[text()='Multiple Windows']")
	private WebElement multipleWindow;
	
	
	//Page Actions
	public PageNewWindow multipleWindow() {
		clickLink(multipleWindow);
		return new PageNewWindow(driver);
	}
			
	

}
