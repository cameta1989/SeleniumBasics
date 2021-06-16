import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

		String parent = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext())

		{

			String child_window = I1.next();

			if (!parent.equals(child_window))

			{

				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();

			}

		}

		driver.switchTo().window(parent);

		System.out.println(driver.switchTo().window(parent).getTitle());

	}

	{

		// TODO Auto-generated method stub

	}

}
