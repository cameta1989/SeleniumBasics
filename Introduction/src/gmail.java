

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","E:\\Work\\geckodriver.exe");

		WebDriver driver =new FirefoxDriver();
			driver.get("https://rediff.com/");
		
			driver.findElement(By.xpath("//a[@class='signin']")).click();
			driver.findElement(By.name("login")).sendKeys("chanchreekameta");
			driver.findElement(By.name("passwd")).sendKeys("Hello");
			driver.findElement(By.name("proceed")).click();
	
			
		
			
		// TODO Auto-generated method stub
			

	
}
}

