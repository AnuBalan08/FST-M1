package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	static WebDriver driver;
	
	@BeforeClass (alwaysRun = true)
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test (groups = {"header", "buttons"})
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test (dependsOnMethods = {"getTitle"}, groups = {"header"})
	public void header_Three() {
		WebElement headerThree = driver.findElement(By.tagName("h3"));
		Assert.assertEquals(headerThree.getText(), "Heading #3");
	}
	
	@Test (dependsOnMethods = {"getTitle"}, groups = {"header"})
	public void header_five_color() {
		String headerFiveColor = driver.findElement(By.tagName("h5")).getCssValue("color");
		Assert.assertEquals(headerFiveColor, "rgba(147, 51, 234, 1)");
	}
	
	@Test (dependsOnMethods = {"getTitle"}, groups = {"buttons"})
	public void emerald_button() {
		String text = driver.findElement(By.xpath("//button[contains(@class , 'emerald')]")).getText();
		Assert.assertEquals(text, "Emerald");
	}
	
	@Test (dependsOnMethods = {"getTitle"}, groups = {"buttons"})
	public void ThirdRowFirstButtonColor() {
		String button_color = driver.findElement(By.xpath("//button[contains(@class , 'purple')]")).getCssValue("color");
		Assert.assertEquals(button_color, "rgba(255, 255, 255, 1)");
	}
	
	@AfterClass(alwaysRun = true)
	public void TearDown() {
		driver.quit();
	}

}
