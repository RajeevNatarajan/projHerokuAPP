package pagesRepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageDynamicControlFinal extends PageUtility{
	public boolean txtBoxEna;
	public WebDriver driver;
	public PageDynamicControlFinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	//Page Elements
	
	@FindBy(xpath="//button[normalize-space()='Remove']")
	private WebElement removeBtn;
	
	@FindBy(xpath="//p[@id='message']")
	private WebElement messageRemove;
	
	@FindBy(xpath="//button[normalize-space()='Enable']")
	private WebElement enableBtn;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement textBox;
	
	//Page Actions
	
	public void removeBtnClick() {
		clickLink(removeBtn);
		
	}
	
	public String messsageRemoveGet() {
		String actualText2 = messageRemove.getText();
		return actualText2;
		
	}
	
	public void enableBtnClick() {
		clickLink(enableBtn);
		
	}
	
	public void textBoxEnter() {
		
		txtBoxEna = textBox.isEnabled();
		if (txtBoxEna = true) {
			 textBox.sendKeys("Im a robot");
		
	}
	
}
}

