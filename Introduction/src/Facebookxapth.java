import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookxapth {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Work\\geckodriver.exe");

		WebDriver driver =new FirefoxDriver();
		////tagname[@attribute='value']
		driver.get("http://facebook.com");
		/*driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		// TODO Auto-generated method stub
		

		////tagName[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hi");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
		

	}

}
