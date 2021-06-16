import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com/");
		Select s=new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		
		s.selectByIndex(3);
		
		
		
		

	}

}
