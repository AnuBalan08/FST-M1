import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " + driver.getTitle());
		WebElement find_checkbox = driver.findElement(By.xpath("//*[@id = 'checkbox']"));
//		find_checkbox.click();
		System.out.println("Before selecting checkbox, check box state is:  "+ find_checkbox.isSelected());
//		driver.findElement(By.xpath("//*[text()='Toggle Checkbox']")).click();
		find_checkbox.click();
		System.out.println("After selecting checkbox, check box state is:  "+ find_checkbox.isSelected());
		
		driver.close();
		

	}

}
