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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookmyShow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']")).click();
		driver.findElement(By.xpath("//ul[@class='sc-bNQFlB URchM']/descendant::img[@alt='BANG']")).click();
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Triple riding");
		driver.findElement(By.xpath("//ul[@class='sc-sPYgB gVUFKz']/li[@class='sc-gJqsIT jMjMYb']")).click();
		driver.findElement(By.xpath("//div[@class='styles__BannerContainer-sc-qswwm9-2 etlsyE']/descendant::span[text()='Book tickets']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		//List<WebElement> details = driver.findElements(By.xpath("//section[@class='phpShowtimes showtimes']/descendant::div/descendant::li"));
		List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class='__venue-name']"));
		int count = ele1.size();
		System.out.println(count);
		List<WebElement> ele2 = driver.findElements(By.xpath("//a[@class='showtime-pill']"));
		List<WebElement> ele4 = driver.findElements(By.xpath("//label[text()='M-Ticket']"));
		List<WebElement> dat = driver.findElements(By.xpath("//div[@class='showtime-pill-container _available']"));
		//int count = dat.size();
		Actions act=new Actions(driver);
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\shashi.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i = 0; i <count; i++) {
			Row row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(ele1.get(i).getText());
			FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\shashi.xlsx");
			book.write(fos);

		}
		for (int i = 0; i < count; i++) {
			Row row = sheet.createRow(i+1);
			row.createCell(1).setCellValue(ele1.get(i).getText());
			FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\shashi.xlsx");
			book.write(fos);

		}
	}
}
