package pagesRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageUploadBoxFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageUploadBoxFinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	//Page Elements
	
	@FindBy (xpath="//div[@id='drag-drop-upload']") 
	private WebElement uploadBox;
	
	//Page Actions
	
	public void FileUploadSelection() throws AWTException {
		
		Robot robot = new Robot();
		
		clickLink(uploadBox);
		
		robot.setAutoDelay(2000);
		StringSelection stringSel = new StringSelection("C:\\Users\\LENOVO\\Desktop\\sample.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSel, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	

}
