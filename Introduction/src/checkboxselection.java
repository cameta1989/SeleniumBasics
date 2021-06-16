import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxselection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\Introduction\\Webdrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();   
	    driver.get("https://goair.in/");	
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	      driver.findElement(By.xpath("//input[@id='Adults']")).click();
	    
	    
	    
	    
	    
	    
		
		// TODO Auto-generated method stub

	}

}
