import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s=new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByIndex(3);
		
		// TODO Auto-generated method stub

	}

}
