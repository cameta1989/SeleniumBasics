import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoAirDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\Work\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.goair.in/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='originReq']")).click();

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("MUM");

		Thread.sleep(1000);

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		source = driver.findElement(By.xpath("//input[@placeholder='To']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("DEL");

		Thread.sleep(1000);

		for(int i=1;i<3;i++)

		{

		source.sendKeys(Keys.ARROW_DOWN);

		}

		source.sendKeys(Keys.ENTER);
		
	
		// TODO Auto-generated method stub

	}

}
