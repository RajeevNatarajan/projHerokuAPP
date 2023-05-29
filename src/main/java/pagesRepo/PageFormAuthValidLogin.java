package pagesRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFormAuthValidLogin extends PageUtility{

		public WebDriver driver;
		public PageFormAuthValidLogin(WebDriver driver) {
			super(driver);
			this.driver=driver;
		}
		
		//Page Elements
		
		@FindBy(xpath="//input[@id='username']")
		private WebElement usrName;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement passWrd;
		
		@FindBy(xpath="//i[@class='fa fa-2x fa-sign-in']")
		private WebElement lgnBtn;
		
		
		//Page Actions
		public PageFormValidLoginfinal FormValidLogin() {
			usrName.sendKeys("tomsmith");
			passWrd.sendKeys("SuperSecretPassword!");
			clickLink(lgnBtn);
			
			return new PageFormValidLoginfinal(driver);
			
			
		}
		

}
