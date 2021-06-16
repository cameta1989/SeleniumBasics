import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath(("(//span[@class='lbl_input latoBold appendBottom10'])[1]"))).click();
		WebElement month = driver.findElement(By.cssSelector("div[class='DayPicker-Caption']"));
		while (!month.getText().contains("April")) {

			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

		}

		List<WebElement> element = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));

		int datesCount = driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).size();

		for (int i = 0; i < datesCount; i++)

		{

			String date = driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).getText();

			if (date.equalsIgnoreCase("28"))

			{

				driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).click();

				System.out.println(date);

				break;

			}

		}

	}

	{

	}

	{
	}
}
