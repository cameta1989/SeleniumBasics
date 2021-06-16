import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexcercise2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");

        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        //entire panel  get selected
         int rowcount =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
         int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
         // its needed for loop
         int sum=0;
         for ( int i =0; i<count-2; i++)
         {
         String value  = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
         //i=0 gettext is 19, so value is 19 thats is string
         int valueinteger = Integer.parseInt(value);//java function to change string (value is string )to integer
         sum=sum+valueinteger;//add is 0 value integer is 19 (0+19) so sum is 19and  next time i=1 value is  1 so 19+1=20...sum 20  i here 47 and sum is 20 sum will be 20+47
       	//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
         }

        String Extras= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extraValue = Integer.parseInt(Extras);//change the string value to integer
        int TotalSumValue= sum+extraValue;
        System.out.print(TotalSumValue +"\n");
       
        System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

        int ActualTotalVAlue=Integer.parseInt(ActualTotal);
        if(ActualTotalVAlue==TotalSumValue)
        {
          System.out.println("Count Matches");
        }
        else
        {
          System.out.println("count fails");
        }
	}
}