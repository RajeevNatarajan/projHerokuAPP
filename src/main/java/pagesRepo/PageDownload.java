package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDownload extends PageUtility {
	
	public WebDriver driver;
	
	public PageDownload(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	//Page elements
	
	
	@FindBy(xpath="//a[normalize-space()='File Download']")
	private WebElement dwnLoad;

	
	//Page Actions
	
	public PageDownLoadFinal dwnLoadClick() {
		clickLink(dwnLoad);
		return new PageDownLoadFinal(driver);
	}
}
