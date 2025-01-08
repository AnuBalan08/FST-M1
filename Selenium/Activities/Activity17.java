
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
	
	static Select select;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement multiselectsection = driver.findElement(By.xpath("(//select)[2]"));
		select = new Select(multiselectsection);
		
		select.selectByContainsVisibleText("HTML");
		
		for(int i =3; i<=5; i++) {
			select.selectByIndex(i);
		}
		
		System.out.println("Printing all selected options:");
		printSelectedValues(select.getAllSelectedOptions());
		
		select.selectByValue("nodejs");
		
		select.deselectByIndex(4);
		System.out.println("Printing all selected values after deselecting the value in index 5");
		printSelectedValues(select.getAllSelectedOptions());
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
	public static void printSelectedValues(List<WebElement> selectedOptions) {
		
		for(WebElement option : selectedOptions) {
			System.out.println (option.getText());
		}
		
	} 

}
