import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	/*driver.get("http://www.axisbank.com");Hit URL
	System.out.println(driver.getTitle());//validate your page title.
	
	System.out.println(driver.getCurrentUrl());//validate whether you are on correct page or not
	
	//System.out.println(driver.getPageSource()); //
	
	driver.navigate().to("http://www.yahoo.com");
	//driver.navigate().back();
	//driver.navigate().forward();
	
	driver.close();
	//driver.quit();*/
}
}
