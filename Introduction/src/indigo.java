import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indigo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://goindigo.in/");
		Thread.sleep(5000);
		driver.findElement(By.name("passenger")).click();
		System.out.println(driver.findElement(By.name("passenger")).getText());
		for(int i=1; i<3; i++)

		{

		      driver.findElement(By.className("icon-plus")).click();
		      System.out.println(driver.findElement(By.name("passenger")).getText());

		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("window.scrollBy(0,200)");

	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[@class='passenger-done-blck']//button")).click();
	}
}
