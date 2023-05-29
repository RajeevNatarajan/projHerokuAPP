package pagesRepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFormAuthLoginFinal extends PageUtility{

	public WebDriver driver;
	public PageFormAuthLoginFinal(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//Page Elements
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement usrName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWrd;
	
	//Page Actions
	
	public static String[][] readexcel(String filename, String sheetname) throws IOException {

			File file = new File("C:\\rvn\\rajeevCanada\\SeleniumProjects\\TestData.xlsx");

			FileInputStream ips = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(ips);
		
			Sheet sh = wb.getSheet("Data");

			int rowNum = sh.getLastRowNum();
			int colNum = sh.getRow(0).getLastCellNum(); 
			String[][] data = new String[rowNum][colNum];

			for (int i = 0; i < rowNum; i++) { 

				Row row = sh.getRow(i);

				for (int j = 0; j < colNum; j++) {

					String value = row.getCell(j).getStringCellValue();
					data[i][j] = value;
				}

			}
			return data;
		}
	
	
		public void  FormAuthInvalidCheck() throws IOException, InterruptedException{
			String [][] dataip = PageFormAuthLoginFinal.readexcel("TestData", "Data");
		
			for(int i=1; i<dataip.length ; i++){
				String user = dataip[i][0];
				String pass = dataip[i][1];
			
				usrName.clear();
				usrName.sendKeys(user);
				passWrd.clear();
				passWrd.sendKeys(pass);
		
				WebElement errMsg = driver.findElement(By.xpath("//div[@id='flash']"));
				
				//String errMsgText =errMsg.getText();
			
		}
			
	}
	}
	
	

