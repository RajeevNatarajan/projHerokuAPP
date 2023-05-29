package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCheckBoxFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageCheckBoxFinal(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	//Page Elements
	
	@FindBy(xpath=" (//input[@type='checkbox'])[1]")
	private WebElement chkBox1;
	boolean box1Select = chkBox1.isSelected();
	
	@FindBy(xpath=" (//input[@type='checkbox'])[2]")
	private WebElement chkBox2;
	boolean box2Select = chkBox2.isSelected();
	//Page Actions
	
	public void chkBox1_clk() {
	
		if (box1Select = false){
			chkBox1.click();	
		}
	}
		
	public void chkBox2_clk() {
		if (box2Select = false){
			chkBox2.click();
		}
		
	}
	
}
