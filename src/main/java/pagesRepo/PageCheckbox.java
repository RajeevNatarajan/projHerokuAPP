package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCheckbox extends PageUtility {
	
	public WebDriver driver;
	
	public PageCheckbox (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements
	
	@FindBy(xpath="//a[normalize-space()='Checkboxes']")
	private WebElement chkBox;
	
	
	//Page Actions
	
	public PageCheckBoxFinal chkBoxClick() {
		clickLink(chkBox);
		return new PageCheckBoxFinal(driver); 
	
	}
	
}
