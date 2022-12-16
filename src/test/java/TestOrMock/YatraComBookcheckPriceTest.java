package TestOrMock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraComBookcheckPriceTest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Scanner s=new Scanner(System.in);
		String date=s.next();
		
		//Create an instance of ChromeOptions class
       ChromeOptions opt=new ChromeOptions();
       
       //Then Add chrome switch to disable notification - "--disable-notifications"
	   opt.addArguments("--disable-notifications");
	   
	   //After that set path for driver exe
	   WebDriverManager.chromedriver().setup();
	   
	   //and then pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//button[.='Ok,I Agree']")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		Thread.sleep(4000);
		 WebElement ele = driver.findElement(By.xpath("//tr/ancestor::div[@id='monthWrapper']/descendant::td[@id='"+date+"']/span"));
		 String price = ele.getText();
		System.out.println("Price of that day "+date+"  is ==> "+ price );
	}
}
