package TestOrMock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class ReadPriceIphoneStoreinExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	WebElement ele = driver.findElement(By.xpath("//div[@class='s-result-item s-asin sg-col-0-of-12"
			+ " sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16'"
			+ " and @data-cel-widget='search_result_2']/descendant::div[@class='sg-col-inner']"
			+ "/descendant::span[@class='a-price-whole']"));
	String text = ele.getText();
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\writeIphonePrice.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue(text);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\writeIphonePrice.xlsx");
	book.write(fos);
}
}
