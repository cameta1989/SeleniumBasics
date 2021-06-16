import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("http://spicejet.com"); //URL in the browser
	    ChromeOptions options = new ChromeOptions();

	    options.setPageLoadStrategy(PageLoadStrategy.NONE);

	    System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");

	        WebDriver driver1=new ChromeDriver(options);   

	        driver.get("http://www.spicejet.com/");

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	        System.out.println(driver.getTitle());

	        // OriginStation

	        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

	        driver.findElement(By.cssSelector("a[value='DEL']")).click();     

	    // Destination

	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

	        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

	    while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("May"))

	    {

	    // driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	    driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

	    }

	    java.util.List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

	    int count= dates.size();

	    for(int i=0; i<count; i++)

	    {

	    String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).getText();

	    if(txt.equalsIgnoreCase("16"))

	    {

	    driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();

	    System.out.println(txt);

	    break;

	    }

	    }

	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

	    {

	        System.out.println("its disabled");

	        Assert.assertTrue(true);

	    }else

	    {

	        Assert.assertTrue(false);

	    }

	    // Select Passengers

	    Thread.sleep(4000);

	        driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

	        Thread.sleep(4000);

	        WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

	        Select adultsdrp = new Select(Adults);

	        adultsdrp.selectByValue("2");

	        WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

	        Select childsdrp = new Select(childs);

	        childsdrp.selectByValue("2");

	        driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

	        System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

	        //Static Currency Dropdown

	        WebElement Currency =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

	        Select currencydrp = new Select(Currency);

	        currencydrp.selectByValue("USD");

	    Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("value"), "USD");

	    System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));

	    }

	    }

	    



	  