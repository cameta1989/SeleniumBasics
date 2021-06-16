import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		// Adults
		WebElement adult = driver.findElement(By.id("Adults"));

		Select s = new Select(adult);
		s.selectByIndex(4);

		// Childrens
		WebElement ch = driver.findElement(By.id("Childrens"));

		Select s1 = new Select(ch);

		s1.selectByIndex(2);

		WebElement inf = driver.findElement(By.id("Infants"));
		Select s2 = new Select(inf);
		s2.selectByIndex(1);

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirates");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default ")).click();
		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

	// Adults

}
