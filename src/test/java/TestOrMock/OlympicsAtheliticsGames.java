package TestOrMock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicsAtheliticsGames {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://olympics.com/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//span[text()='Athletes']/ancestor::ul[@class='b2p-nav__menu -header--links analytics-multiple-cta']/descendant::span[text()='Athletes']")).click();

		List<WebElement> ele = driver.findElements(By.xpath("//h1[@class='article--title']"));
		int count = ele.size();
		List<WebElement> ele2 = driver.findElements(By.xpath("//span[@class='country--name']"));
		List<WebElement> ele3 = driver.findElements(By.xpath("//span[@class='discipline--name']"));
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\writeIphonePrice.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");

		for (int i = 0; i < count; i++) {
			Row row = sheet.createRow(i+1);  //here i+1 because for taking 2nd row in excel
			row.createCell(0).setCellValue(ele.get(i).getText());
			row.createCell(1).setCellValue(ele2.get(i).getText());
			row.createCell(2).setCellValue(ele3.get(i).getText());
			FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\writeIphonePrice.xlsx");
			book.write(fos);
		}
		
	}
}

