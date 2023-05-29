package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDynamicControl extends PageUtility {
	public WebDriver driver;
	
	public PageDynamicControl(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//Page Elements
	@FindBy(xpath="//a[normalize-space()='Dynamic Controls']")
	private WebElement dynamicControlSel;
	
	//Page Actions
	public PageDynamicControlFinal dynamiccontrolSelect() {
		clickLink(dynamicControlSel);
		return new PageDynamicControlFinal(driver);
	}

}
