import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/login-form/");
		System.out.println("Title of the page: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id = \"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name = \"password\"]")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class = \"svelte-1pdjkmx\"]")).click();
		Thread.sleep(2000);
		System.out.println("Title after login: " + driver.getTitle());
		driver.quit();

	}

}
