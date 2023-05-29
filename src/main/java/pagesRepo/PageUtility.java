package pagesRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
	public  WebDriver driver;
	public PageUtility(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void enterText(WebElement e, String text) {
		waitForElement(e);
		e.sendKeys(text);
	}
	
	public void waitForElement(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void clickLink(WebElement e) {
		waitForElement(e);
		e.click();
	}
	public String getText(WebElement e) {
		waitForElement(e);
		return e.getText();
	}
	
	public void moveToElement(WebElement e) {
		Actions actions = new Actions(driver);
		waitForElement(e);
		actions.moveToElement(e).perform();
	}
	
	public void selectByValue(WebElement e, String value) {
		waitForElement(e);
		Select selectElement = new Select(e);
		selectElement.selectByValue(value);
	}
}

