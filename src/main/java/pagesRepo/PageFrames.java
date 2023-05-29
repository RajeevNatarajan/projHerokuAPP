package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFrames extends PageUtility {
	
	public WebDriver driver;
	
	public PageFrames (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	//Page elements
	
	@FindBy(xpath="//a[normalize-space()='Frames']")
	private WebElement iFrameSel;
	
	//Page Actions
	public PageIFrame iFrameSelect() {
		clickLink(iFrameSel);
		
	return new PageIFrame(driver);
	}
}
