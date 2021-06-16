import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleSearch {

	public static void main(String[] args) throws AWTException {
		{

			System.setProperty("webdriver.chrome.silentOutput", "true");

			System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.amazon.com/");

			Actions a = new Actions(driver);

			WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

			a.moveToElement(move).build().perform();

			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
					.sendKeys("edible oil").doubleClick().build().perform();

		}
	}

}
