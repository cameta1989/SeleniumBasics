import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goaircheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
	
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();   
	    driver.get("https://goair.in/");	
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[@for='Adults']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@id='no']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[@for='Armed']")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[text()='Ok'])[2]")).click();
	  //  (//button[text()='Ok'])[2]
	   
	    	
	
	 
	    
	    
	    
	    
	   
	    
	   

	  

	}
}
		
		
