package TestOrMock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeAndPlayVideo {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).click();
	driver.findElement(By.name("search_query")).sendKeys("Varaha roopam song");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy' and @class='style-scope ytd-searchbox']")).click();
	driver.findElement(By.xpath("//yt-formatted-string[text()='ವರಾಹ ರೂಪಂ | Varaha Roopam song with Lyrics | Kannada and English lyrics | Kantara | Ajneesh Lokanath']")).click();
}
}
