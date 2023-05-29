package pagesRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFormValidLoginfinal extends PageUtility {

	public WebDriver driver;
	public PageFormValidLoginfinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//Page Elements
	@FindBy(xpath="//h4[contains(text(),'Welcome to the Secure Area. When you are done clic')]")
	private WebElement finalMsg;
	
	//Page Actions
	public String popWindowOk() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String actualText3 = finalMsg.getText();
		
		return actualText3;
		
		
		
	}
}
