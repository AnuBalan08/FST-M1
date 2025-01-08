
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert();
		
		Alert alert = driver.switchTo().alert();
		
		String message = alert.getText();
		System.out.println(message);
		alert.accept();	
		
		assert driver.findElement(By.id("result")).isDisplayed();
		
		driver.close();
		
	}

}
