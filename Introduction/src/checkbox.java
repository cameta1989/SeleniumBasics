import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\Work\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://spicejet.com/");
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//Assert.assertFalse(true);
	 
	 System.out.println (driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	 System.out.println (driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	 
	// System.out.println( driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	 
	 
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 
	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	 
	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	 if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
     System.out.println("its enabled");
     Assert.assertTrue(true);
     
	
}
	 
	 else
	 {
		 Assert.assertTrue(false);
	     
		 
	 }
	 
	 
		
		
	}

}
