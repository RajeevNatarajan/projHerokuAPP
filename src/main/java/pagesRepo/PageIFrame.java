package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageIFrame extends PageUtility {
	public WebDriver driver;
	
	public PageIFrame (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	//Page Elements
	@FindBy(xpath="//a[normalize-space()='iFrame']")
	private WebElement iFrameSel;
	
	
	//Page Actions
	public  PageIFrameFinal iFrameSelect() {
		clickLink(iFrameSel);
		return new PageIFrameFinal(driver);
	}
}
