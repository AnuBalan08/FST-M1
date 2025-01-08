
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		
		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name-')]")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("anu.balan@ibm.com");
		driver.findElement(By.xpath("//input[@data-testid=\"event-date\"]")).sendKeys("08/04/1994");
		
		driver.findElement(By.xpath("//textarea[contains(@name, 'additional-details')]")).sendKeys("Testing");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("action-confirmation")));
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Thread.sleep(2000);
		
		System.out.println("Success Message is: " + message);
		
		driver.close();
		
		
	
	}

}
