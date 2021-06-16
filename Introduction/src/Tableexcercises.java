import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexcercises {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20202/rsa-vs-pak-2nd-odi-pakistan-tour-of-south-africa-2018-19");



		WebElement table = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));



		int count = table.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']"))

		.size();



		// int count = table.findElements(By.cssSelector("div[id='innings_1']

		// [class='cb-col cb-col-100 cb-scrd-itms']")).size();



		for (int i = 0; i < count - 2; i++)



		System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"))

		.get(i).getText());



		driver.findElement(By.xpath("//div[text()='Extras')/following- sibling::div")).getText();

		}

		}

