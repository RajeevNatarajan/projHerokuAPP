package pagesRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageStatusCodeFinal extends PageUtility {
	
	public WebDriver driver;
	
	public PageStatusCodeFinal (WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//Page Elements
	@FindBy(css="a[href='status_codes/200']")
	private WebElement statusCode200;
	
	@FindBy(css="a[href='status_codes/301']")
	private WebElement statusCode301;
	
	@FindBy(css="a[href='status_codes/404']")
	private WebElement statusCode404;
	
	@FindBy(css="a[href='status_codes/500']")
	private WebElement statusCode500;
	
	@FindBy(css="a[href='/status_codes']")
	private WebElement statusCodes;
	
	
	//Page Actions
	
	public void statusCodeCheck() {
		clickLink(statusCode200);
		String msg1 = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]")).getText();
		System.out.println(msg1);
		clickLink(statusCodes);
		
		clickLink(statusCode301);
		String msg2 = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]")).getText();
		System.out.println(msg2);
		clickLink(statusCodes);
		
		clickLink(statusCode404);
		String msg3 = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]")).getText();
		System.out.println(msg3);
		clickLink(statusCodes);
		
		clickLink(statusCode500);
		String msg4 = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]")).getText();
		System.out.println(msg4);
		clickLink(statusCodes);
		
	}
	
}
