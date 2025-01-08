
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.findElement(By.xpath("//button[text() = 'Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		selectButtonFromChildTab();

		driver.findElement(By.xpath("//button[text() = 'Open Another One']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		selectButtonFromChildTab();
		
		driver.findElement(By.xpath("//button[text() = 'Open Another One']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		selectButtonFromChildTab();
		
	}
	
	public static void selectButtonFromChildTab() {
		Set<String> handles = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handles); // Convert Set to List
        String latestHandle = handlesList.get(handlesList.size() - 1); // Get the newest tab
        driver.switchTo().window(latestHandle);
        System.out.println("Switched to child tab: " + driver.getTitle());
		
	}

}
