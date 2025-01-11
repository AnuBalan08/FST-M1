package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test
	public void find_black() {
		WebElement black_element = driver.findElement(By.xpath("//button[text() = 'Black']"));
		Assert.assertTrue(black_element.isDisplayed());
		Assert.assertEquals(black_element.getText(), "Black");
	}
	
	@Test (enabled = false)
	public void find_yellow_skip() {
		
		Boolean yellowValue = driver.findElement(By.xpath("//button[text() = 'Yellow']")).isDisplayed();
		Assert.assertEquals(yellowValue, true);
	}
	
	@Test 
	public void find_cyan_skipException() {
		
		throw new SkipException("Skipping test case");
	}
	
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
