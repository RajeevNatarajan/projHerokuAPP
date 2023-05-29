package pagesRepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDownLoadFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageDownLoadFinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	//Page Elements

	@FindBy(xpath = "//a[normalize-space()='Sample.docx']")
	private WebElement dwnFileName;
	
	
	//Page Actions
	
	public void downLoadFileName() {
		clickLink(dwnFileName);
				
	}
	
}
