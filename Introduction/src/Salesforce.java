import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
        System.out.println (driver.findElement(By.id("username")).getText());
         driver.findElement(By.name("pw")).sendKeys("8844");
         driver.findElement(By.xpath("//*[@id='Login']")).click();
       System.out.println (driver.findElement(By.cssSelector("div#error.loginError")).getText());
         
		// TODO Auto-generated method stub

	}

}