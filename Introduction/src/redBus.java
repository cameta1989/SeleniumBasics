import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Ahmedabad");

		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		driver.findElement(By.id("dest")).click();

		driver.findElement(By.id("dest")).sendKeys("Udaipur");
		Thread.sleep(3000);
		//driver.findElement(By.id("dest")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		while(driver.findElement(By.xpath("//tr[@class='rb-monthHeader']")).getText().contains("Jun 2020"))
		{
						System.out.println(driver.findElement(By.xpath("//tr[@class='rb-monthHeader']")).getText());
						break;
		}
		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));

		int Count = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td")).size();

		System.out.println("count is " + Count);

		for (int i = 0; i < Count; i++)

		{

			String Text = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td")).get(i)
					.getText();

			if (Text.equalsIgnoreCase("14"))

			{

				driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td")).get(i).click();

				System.out.println(Text);
				driver.findElement(By.id("search_btn")).click();
				

		}

	}

}}
