package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDropDown extends PageUtility {
	public WebDriver driver;
	
	public PageDropDown (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	//Page Elements
	
	@FindBy(xpath="//li[11]")
	private WebElement dropDown;
	
	
	//Page Actions
	
	public PageDropDownFinal dropDownClick() {
		clickLink(dropDown);
		return new PageDropDownFinal(driver);
	}
}
