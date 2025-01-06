
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		
		System.out.println("Title of the page:" + driver.getTitle());
		
		String headingThreeText =driver.findElement(By.tagName("h3")).getText();
		System.out.println(headingThreeText);
		System.out.println(driver.findElement(By.tagName("h5")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.xpath("//*[text() = \"Purple\"]")).getDomAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[text() = \"Slate\"]")).getText());
		
		driver.quit();
		
	}

}
