import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentToday {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("checkBoxOption2")).click();
		String input = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(input);
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(input);
		driver.findElement(By.id("name")).sendKeys(input);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		String alert = driver.switchTo().alert().getText();
		if (alert.equals(input)) {

			driver.switchTo().alert().accept();

		} else {

			driver.switchTo().alert().dismiss();

		}

	}
	// TODO Auto-generated method stub

}
