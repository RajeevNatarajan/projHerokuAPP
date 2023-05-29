package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFileUploadFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageFileUploadFinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	
	//Page Elements
	
	@FindBy(xpath="//input[@id='file-upload']")
	private WebElement chooseFileBtn;
	
	@FindBy(xpath="//input[@id='file-submit']")
	private WebElement uploadBtn;
	
	//Page Actions
	
	public void fileUploadSelect() {
		
		chooseFileBtn.sendKeys("C:\\Users\\LENOVO\\Desktop\\sample.txt");
		clickLink(uploadBtn);
	
	}
}
