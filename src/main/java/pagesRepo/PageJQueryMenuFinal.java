package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageJQueryMenuFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageJQueryMenuFinal (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements 
	@FindBy(xpath="//a[normalize-space()='Enabled']")
	private WebElement menuEnabled;
	
	@FindBy(xpath="//a[normalize-space()='Back to JQuery UI']")
	private WebElement jQuerySel;
	
	//Page Actions
	public void menuSelect() {
		clickLink(menuEnabled);
		clickLink(jQuerySel);
		
	}

}
