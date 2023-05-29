package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFileUpload extends PageUtility {
	
	public WebDriver driver;
	public PageFileUpload(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//Page Elements
	
	@FindBy(xpath="//a[normalize-space()='File Upload']")
	private WebElement fileuploadLink;
	
	
	//Page Actions
	
	public PageFileUploadFinal fileUploadLinkClick() {
		clickLink(fileuploadLink);
		return new PageFileUploadFinal(driver);
	}
}
