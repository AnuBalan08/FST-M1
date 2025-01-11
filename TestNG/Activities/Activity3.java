package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity3 {
	
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	
	@Test 
	@Parameters({"username", "password"})
	public void getTitle(@Optional("defaultUsername") String username, @Optional("defaultPassword") String password) {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Login Form");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class = \"svelte-1pdjkmx\"]")).click();
		System.out.println("Title after login: " + driver.getTitle());
		String message = driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals(message, "Welcome Back, Admin!");
	}
	
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
