package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

	
	static WebDriver driver ;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://training-support.net");
	}
	
	@Test(priority = 1)
	public void home_page () {
		
		Assert.assertEquals(driver.getTitle(), "Training Support");
		driver.findElement(By.xpath("//*[text() = 'About Us']")).click();
		
	}
	
	@Test(priority = 2)
	public void about_us() throws InterruptedException {
		
		System.out.println("Title of the page: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
