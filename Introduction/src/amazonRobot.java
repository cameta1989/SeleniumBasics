import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();

		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		Robot robot = new Robot();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("edible oil");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		driver.quit();

		// TODO Auto-generated method stub

	}

}
