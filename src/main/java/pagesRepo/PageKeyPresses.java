package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageKeyPresses extends PageUtility {
	
	public WebDriver driver;
	
	public PageKeyPresses (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements
	@FindBy(css="a[href='/key_presses']")
	private WebElement keyPressLnk;
	
	//Page Actions
	public PageKeyPressFinal keyPressLnkClick() {
		clickLink(keyPressLnk);
		return new PageKeyPressFinal(driver);
	}
}
