import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " + driver.getTitle());
		

		System.out.println("Validate whether edit field is enabled:  ");
		System.out.println("=======Before click the Enable input button====");
		WebElement editfield = driver.findElement(By.xpath("//*[@id = 'textInput']"));
		System.out.println("Edit field enabled: True/false:" +check_status(editfield));
		
		driver.findElement(By.xpath("//*[text()='Enable Input']")).click();
		System.out.println("=======After clicked the Enable input button====");
		System.out.println("Edit field enabled: True/false:" +check_status(editfield));
		driver.close();
		
	}
	
	public static boolean check_status(WebElement find_editField) {
		
//		WebElement find_editField = driver.findElement(By.xpath("//*[@id = 'textInput']"));
		if(find_editField.isEnabled()) {
			return true;
		}else return false;
		
	}

}
