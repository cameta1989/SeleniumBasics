import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://rediff.com/");
			driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
			driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
			driver.findElement(By.cssSelector("input#password")).sendKeys("Good Morning");
			driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		// TODO Auto-generated method stub



}
}
