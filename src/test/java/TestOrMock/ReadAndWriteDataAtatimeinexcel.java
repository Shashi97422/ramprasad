package TestOrMock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAndWriteDataAtatimeinexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");
	Row row = sheet.createRow(0);
	//Row row = sheet.getRow(0);
	Cell cell1 = row.createCell(0);
	Cell cell = row.getCell(0);
	cell1.setCellValue("Shashidhar");
	String data = cell.getStringCellValue();
	System.out.println(data);
	FileOutputStream fos =new FileOutputStream("C:\\Users\\HP\\Desktop\\data.xlsx");
	book.write(fos);
}
}
