import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");

		driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent");
		System.out.println(driver.getTitle());

	}
}
