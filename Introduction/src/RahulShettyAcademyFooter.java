import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademyFooter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.findElements(By.tagName("a")).size());// gives total links present on page

		WebElement footerLink = driver.findElement(By.cssSelector("div[id='gf-BIG']"));

		System.out.println(footerLink.findElements(By.tagName("a")).size());

		WebElement columnLink = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

		System.out.println(columnLink.findElements(By.tagName("a")).size());

		for (int i = 1; i < columnLink.findElements(By.tagName("a")).size(); i++)

		{

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columnLink.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			Thread.sleep(5000);

		}

		Set<String> countwindow = driver.getWindowHandles();

		Iterator<String> it = countwindow.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());

			System.out.println(driver.getTitle());

		}

	}

	{

		// TODO Auto-generated method stub

	}

}
