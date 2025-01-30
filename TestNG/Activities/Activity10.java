package demo;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {
	
	WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/simple-form");
    }
    
    public static List<List<String>> readExcel(String filePath){
    	
    	List<List<String>> data = new ArrayList<List<String>>();
    	try {
    		FileInputStream file = new FileInputStream(filePath);
    		XSSFWorkbook workbook = new XSSFWorkbook(file);
    		XSSFSheet sheet = workbook.getSheetAt(0);
    		for(Row cells : sheet) {
    			List<String> rowData = new ArrayList<String>();
    			for(Cell cell : cells) {
    				switch (cell.getCellType()) {
    		        case STRING:
    		            rowData.add(cell.getStringCellValue());
    		            break;
    		        case NUMERIC:
    		            rowData.add(String.valueOf(cell.getNumericCellValue()));
    		            break;
    		        case BOOLEAN:
    		            rowData.add(String.valueOf(cell.getBooleanCellValue()));
    		            break;
    		        default:
    		            rowData.add(""); // Handle blank or unexpected cell types
    		    }
    			}
    			data.add(rowData);
    		}
    		file.close();
    		workbook.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return data;
    }
    
    @DataProvider(name = "User Details")
    public static Object[][] userDetails(){
    	
    	String filePath = "C:\\Users\\AnuBalan\\eclipse-workspace\\fst-m1-testng\\src\\test\\resources\\TestNg.xlsx";
    	List<List<String>> data = readExcel(filePath);
		return new Object[][] {
			{data.get(1)},
			{data.get(2)},
			{data.get(3)}
			
		};
    }
    
    @Test(dataProvider = "User Details")
    public void enterDetails(List<String> rows) {
    	
    	WebElement fullName = driver.findElement(By.id("full-name"));
        fullName.sendKeys(rows.get(0));
        
        driver.findElement(By.id("email")).sendKeys(rows.get(1));
        driver.findElement(By.name("event-date")).sendKeys(rows.get(2).replaceAll("\"", ""));
        driver.findElement(By.id("additional-details")).sendKeys(rows.get(3));
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        assertEquals(message, "Your event has been scheduled!");
        driver.navigate().refresh();
    	
    }
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }

}
