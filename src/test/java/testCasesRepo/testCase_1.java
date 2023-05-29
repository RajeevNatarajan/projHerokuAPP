package testCasesRepo;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pagesRepo.PageCheckBoxFinal;
import pagesRepo.PageCheckbox;
import pagesRepo.PageDownLoadFinal;
import pagesRepo.PageDownload;
import pagesRepo.PageDropDown;
import pagesRepo.PageDropDownFinal;
import pagesRepo.PageDynamicControl;
import pagesRepo.PageDynamicControlFinal;
import pagesRepo.PageFileUpload;
import pagesRepo.PageFileUploadFinal;
import pagesRepo.PageFormAuthLogin;
import pagesRepo.PageFormAuthLoginFinal;
import pagesRepo.PageFormAuthValidLogin;
import pagesRepo.PageFormValidLoginfinal;
import pagesRepo.PageHover;
import pagesRepo.PageHoverFinal;
import pagesRepo.PageJQueryMenuFinal;
import pagesRepo.PageJqueryMenu;
import pagesRepo.PageKeyPressFinal;
import pagesRepo.PageKeyPresses;
import pagesRepo.PageNewWindow;
import pagesRepo.PageNewWindowFinal;
import pagesRepo.PageOpenWindow;
import pagesRepo.PageStatusCode;
import pagesRepo.PageStatusCodeFinal;
import pagesRepo.PageUploadBoxFinal;

public class testCase_1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openWebsite() {
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
	}
	@Test
	public void sampleActions() throws AWTException, IOException, InterruptedException {
		new PageOpenWindow(driver).multipleWindow();
		new PageNewWindow(driver).clickHereClk();
		Thread.sleep(3000);
		String actualTxt = new PageNewWindowFinal(driver).newWindowChk();
		Assert.assertEquals(actualTxt, "New Window");
		
		new PageHover(driver).hoverClick();
		String actualTxt1 = new PageHoverFinal(driver).getHoverText();
		Assert.assertEquals(actualTxt1, "user2");
		
		new PageCheckbox(driver).chkBoxClick();
		new PageCheckBoxFinal(driver).chkBox1_clk();
		new PageCheckBoxFinal(driver).chkBox2_clk();
		
		new PageDropDown(driver).dropDownClick();
		new PageDropDownFinal(driver).dropDownValueSel();
		
		new PageDynamicControl(driver).dynamiccontrolSelect();
		new PageDynamicControlFinal(driver).removeBtnClick();
		String actualText2 = new PageDynamicControlFinal(driver).messsageRemoveGet();
		Assert.assertEquals(actualText2, "It's gone!");
		
		new PageDynamicControlFinal(driver).enableBtnClick();
		new PageDynamicControlFinal(driver).textBoxEnter();
		
		new PageDownload(driver).dwnLoadClick();
		new PageDownLoadFinal(driver).downLoadFileName();
		
		new PageFileUpload(driver).fileUploadLinkClick();
		new PageFileUploadFinal(driver).fileUploadSelect();
		
		new PageFileUpload(driver).fileUploadLinkClick();
		new PageUploadBoxFinal(driver).FileUploadSelection();
		
		new PageFormAuthLogin(driver).FormAuthLinkclick();
		new PageFormAuthLoginFinal(driver).FormAuthInvalidCheck();
		
		new PageFormAuthLogin(driver).FormAuthLinkclick();
		new PageFormAuthValidLogin(driver).FormValidLogin();
		String actualText3 = new PageFormValidLoginfinal(driver).popWindowOk();
		Assert.assertEquals(actualText3, "Welcome to the Secure Area. When you are done clic");
		
		new PageJqueryMenu(driver).jQueryLinkSel();
		new PageJQueryMenuFinal(driver).menuSelect();
		
		new PageStatusCode(driver).statusCodeLinkSel();
		new PageStatusCodeFinal(driver).statusCodeCheck();
		
		new PageKeyPresses(driver).keyPressLnkClick();
		String dspText = new PageKeyPressFinal(driver).keyActions();
		Assert.assertEquals(dspText, "You entered: TAB");
		
		
	}
	
}

