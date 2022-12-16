package practicepackage;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wickets {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51222/ind-vs-hk-4th-match-group-a-asia-cup-2022");
		ArrayList ele = new ArrayList();
		ele.add(" Haroon Arshad ");
		ele.add(" Ayush Shukla ");
		ele.add(" Ehsan Khan ");
		ele.add(" Aizaz Khan ");
		ele.add(" Yasim Murtaza ");
		ele.add(" Mohammad Ghazanfar ");
		for(Object name:ele) {
			String wickets = driver.findElement(By.xpath("//div[@class='cb-col cb-col-40 text-bold']/ancestor::div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/descendant::a[text()='"+name+"']/ancestor::div[@class='cb-col cb-col-40']/following-sibling::div[@class='cb-col cb-col-8 text-right text-bold']")).getText();
			System.out.println(name+"  wickets ===>"+wickets);
			int no = Integer.parseInt(wickets);
			
		}
		
	}

}

