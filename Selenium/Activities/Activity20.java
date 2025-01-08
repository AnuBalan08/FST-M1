
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {
	
	static WebDriverWait wait;
	static WebDriver driver;
	static Alert alert;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page : " + driver.getTitle());
		
		System.out.println("entering value and accepting the alert");
		select_prompt_handleAlert();
		alert.sendKeys("Awesome!");
		alert.accept();
		printMessage();
		
		System.out.println("entering value and dismissing the alert");
		select_prompt_handleAlert();
		alert.dismiss();
		printMessage();
		
		driver.close();

	}

	public static void select_prompt_handleAlert() {
		driver.findElement(By.id("prompt")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();

	}
	public static void printMessage() {
		String message = driver.findElement(By.id("result")).getText();
		System.out.println("Updated message in parent screen :" + message);
	}
}
