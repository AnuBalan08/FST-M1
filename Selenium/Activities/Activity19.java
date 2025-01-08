
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {
	
	static Alert alert;
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://training-support.net/webelements/alerts");
		
		confirm_alert_window();
		alert.accept();
		print_message();
		
		confirm_alert_window();
		alert.dismiss();
		print_message();
		
		driver.close();
		
	}

	public static void confirm_alert_window() {
		driver.findElement(By.id("confirmation")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println("Content in pop up: " + message);
	}
	
	public static void print_message() {
		String conf_result = driver.findElement(By.id("result")).getText();
		System.out.println("Accepted Confirmation result: " + conf_result);
	}

}
