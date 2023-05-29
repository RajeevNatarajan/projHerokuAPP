package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageJqueryMenu extends PageUtility {
	
	public WebDriver driver;
	
	public PageJqueryMenu (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements {
	@FindBy(xpath="//a[normalize-space()='JQuery UI Menus']")
	private WebElement jQueryLink;
	
	//Page Actions
	public PageJQueryMenuFinal jQueryLinkSel() {
		clickLink(jQueryLink);
		return new PageJQueryMenuFinal(driver);
	}

}
