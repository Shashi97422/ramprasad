package practicepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelToDataprovider.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sheet = book.getSheet("Sheet1");

for(int i=1; i<sheet.getLastRowNum(); i++) {
String username = sheet.getRow(i).getCell(0).getStringCellValue();
double password = sheet.getRow(i).getCell(1).getNumericCellValue();
System.out.println("username==>"+username+" & password ==>"+password);

}
}
}
