import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MI");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
	  
		driver.findElement(By.id("twotabsearchtextbox")).getText();
		System.out.println(driver.findElement(By.id("twotabsearchtextbox")).getSize());
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      String script="return document.getElementById(\"twotabsearchtextbox\").value;";
	      String text=(String)js.executeScript(script);

	      System.out.println(text);
	      int i=0;
	      while(!text.equalsIgnoreCase("mi note 8 pro mobile phone"))
	      {
	    	  i++;

              driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.DOWN);
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

            {
            }

              

	      }

		
	}
