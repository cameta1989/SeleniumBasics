import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Hi");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    
	    		
	
		// TODO Auto-generated method stub

	}
}


