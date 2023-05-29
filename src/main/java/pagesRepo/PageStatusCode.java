package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageStatusCode extends PageUtility {
	
	public WebDriver driver;
	
	public PageStatusCode (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements
	@FindBy(xpath="//a[normalize-space()='Status Codes']")
	private WebElement statusCodeLnk;
	
	//Page Actions
	public PageStatusCodeFinal statusCodeLinkSel() {
		clickLink(statusCodeLnk);
		return new PageStatusCodeFinal(driver);
	}

}
