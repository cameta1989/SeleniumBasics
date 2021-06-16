import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Work\\geckodriver.exe");

		WebDriver driver =new FirefoxDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("Hello");//
		//driver.findElement(By.id("email")).sendKeys("chanchreek.ameta@gmail.com");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("pass")).sendKeys("Music@123");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
	}
}
	


