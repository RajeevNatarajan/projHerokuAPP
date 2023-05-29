package pagesRepo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageKeyPressFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageKeyPressFinal (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements
	
	//Page Actions
	
	public String keyActions() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		String dspText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//robot.keyPress(KeyEvent.VK_ESCAPE);
		//String dspText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		//robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		return dspText;
		
	}

}
