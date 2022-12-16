package TestOrMock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crickbuzz {
	@Test
	public void crickbuzz() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[@class='cb-mat-mnu-itm cb-mat-mnu-all']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'India vs Zimbabwe')]")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		List<WebElement> batter = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::span[text()='India Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-27 ']"));
		System.out.println("***********************");
		System.out.println("Batsman Name      Score");
		System.out.println("***********************");
		for (WebElement batmens : batter) 
		{
			String names = batmens.getText();
			WebElement runs = driver.findElement(By.xpath("//a[normalize-space(text())='"+names+"']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[@class='cb-col cb-col-8 text-right text-bold']"));
			String run = runs.getText();
			System.out.println(names+"  "+run);
		}
		System.out.println("                          ");
		System.out.println("***********************");
		System.out.println("Bowlers Name      wickets");
		System.out.println("***********************");
		List<WebElement> bowler = driver.findElements(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/descendant::div[@id='innings_2']/descendant::div[text()='Bowler']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']/following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms ']/div[@class='cb-col cb-col-40']"));
		for (WebElement bowlers : bowler) {
			String bowlername = bowlers.getText();
			WebElement wickets = driver.findElement(By.xpath("//div[@id='innings_2']/descendant::div[text()='Bowler']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']/following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms ']/descendant::div[@class='cb-col cb-col-40']/a[contains(text(),'"+bowlername+"')]/ancestor::div[@class='cb-col cb-col-40']/following-sibling::div[@class='cb-col cb-col-8 text-right text-bold']"));
			String wicket = wickets.getText();
			System.out.println(bowlername+"  "+wicket);
		}
	}


}
