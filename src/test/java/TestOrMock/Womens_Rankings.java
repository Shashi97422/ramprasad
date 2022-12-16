package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Womens_Rankings {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.icc-cricket.com/rankings/womens/player-rankings/odi");
	driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']/descendant::button[normalize-space(text())='Rankings']/following-sibling::ul/following::li/following::a[@href='/rankings/womens/player-rankings' and normalize-space(text()='Player Rankings') and @class='linked-list__link ']")).click();
}
}
//div[@class='main-navigation__header u-hide-desktop']/descendant::button[contains(text(),"Women's")]/parent::li/descendant::a[contains(text(),'Team Rankings')]