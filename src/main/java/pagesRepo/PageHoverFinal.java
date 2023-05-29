package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHoverFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageHoverFinal (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Page Elements
	
	@FindBy(xpath=" //div[@class='row']//div[2]//img[1]")
	private WebElement hoverImg;
	
	@FindBy(xpath="//h5[normalize-space()='name: user2']")
	private WebElement hoverText;
	
	//Page Actions
	
	public void hoverImgMove() {
		moveToElement(hoverImg);
	 
	}
	
	public String getHoverText() {
		return getText(hoverText);
		 
	}

}
