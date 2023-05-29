package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDropDownFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageDropDownFinal (WebDriver driver) {
		super(driver);
		this.driver= driver;
	}
	
	//Page Elements
	
	@FindBy(xpath="//select[@id='dropdown']")
	private WebElement drpDownsel;
	
	//Page Actions
	
	public void dropDownValueSel() {
		selectByValue(drpDownsel,"Option 2");
		
	}
	
	
}
