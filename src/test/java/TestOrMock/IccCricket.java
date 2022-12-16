package TestOrMock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccCricket {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> names = driver.findElements(By.xpath("//tbody/tr[*]/td/span[@class='u-hide-phablet']"));
		for (WebElement nam : names) {
			String countrynames = nam.getText();
			WebElement rating = driver.findElement(By.xpath("//span[text()='"+countrynames+"']/ancestor::tr[@class='table-body']/descendant::td[@class='table-body__cell u-text-right rating']"));
			System.out.println("country===>"+countrynames+"rating===>"+rating);
		}
	}
}
