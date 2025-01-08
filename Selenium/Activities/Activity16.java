
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title of the page is " +driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Two");
		System.out.println("Second Option " + select.getFirstSelectedOption().getText());
		select.selectByIndex(3);
		System.out.println("Third Option " + select.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		select.selectByValue("four");
		System.out.println("Fourth Option " + select.getFirstSelectedOption().getText());
		List<WebElement> Options = select.getOptions(); 
		System.out.println("Printing all options");
		
		for( WebElement option : Options){
			System.out.println(option.getText());
		}
		Thread.sleep(2000);	
		
		driver.quit();
	}

}
