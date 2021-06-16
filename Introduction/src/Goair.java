import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Goair {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		//1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs",prefs);

		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");

		WebDriver driver =new ChromeDriver(options);

		driver.get("https://www.goair.in/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		Thread.sleep(4000);

		driver.switchTo().frame("preview-notification-frame");

		driver.findElement(By.xpath("//a[@id='NC_CLOSE_ICON']")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[@class='datalist-arrow roundtrip-home']/input")).click();

		driver.findElement(By.xpath("//span[@class='datalist-arrow roundtrip-home']/input")).sendKeys("Mum");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='datalist-arrow roundtrip-home']/input")).sendKeys(Keys.DOWN);

		driver.findElement(By.xpath("//span[@class='datalist-arrow roundtrip-home']/input")).sendKeys(Keys.ENTER);

		// To field

		driver.findElement(By.xpath("(//span[@class='datalist-arrow roundtrip-home']/input)[2]")).click();

		driver.findElement(By.xpath("(//span[@class='datalist-arrow roundtrip-home']/input)[2]")).sendKeys("Del");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='datalist-arrow roundtrip-home']/input)[2]")).sendKeys(Keys.DOWN);

		driver.findElement(By.xpath("(//span[@class='datalist-arrow roundtrip-home']/input)[2]")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='passenger_round']")).click();

		// (//input[@class='plus_adult'])[1]

		Thread.sleep(4000);

		for(int i=0;i<3;i++ )

		{

		    driver.findElement(By.xpath("(//input[@class='plus_adult'])[1]")).click();       

		}

		driver.findElement(By.xpath("//input[@id='traveler_done_round']")).click();

		}

	{
		// TODO Auto-generated method stub

	}

}
