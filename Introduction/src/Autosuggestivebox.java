import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivebox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// TODO Auto-generated method stub
		  driver.get("http://www.ksrtc.in/oprs-web/");

          driver.manage().window().maximize();

          //      // https://tsrtconline.in/oprs-web/

          driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");

          driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

          System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

          System.out.println(driver.findElements(By.xpath("//input[@id='fromPlaceName']")).size());

          JavascriptExecutor js=(JavascriptExecutor)driver;

          String script="return document.getElementById(\"fromPlaceName\").value;";

          String text=(String)js.executeScript(script);

          System.out.println(text);

          int i=0;       

          while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))

          {

            i++;

                driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

                text=(String)js.executeScript(script);

                System.out.println(text);

            if(i>10)

            {

           break;

            }

          }

          if(i>10)

          {

          System.out.println("Element is not found");;

          }

          else

          {

          System.out.println("Element is Found");
	}

}}
