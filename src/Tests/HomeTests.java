package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests {
  @Test
  public void f() throws Exception {
	  
	 // C:\Users\USER\Desktop\SPYWYN\TestingClassNotes\Testcases.xlsx
	  
	  String filepath="C:\\Users\\USER\\Desktop\\SPYWYN\\TestingClassNotes\\Testcases.xls";
	  
	 
	  FileInputStream file=new FileInputStream(filepath);   // it will fetch the file in that path
	  
	  HSSFWorkbook  wb=new HSSFWorkbook(file);
	  
	  HSSFSheet sh=wb.getSheetAt(1);
	  
	  String name=sh.getRow(1).getCell(4).getStringCellValue();
	  
	  String phoneNo=sh.getRow(2).getCell(4).getStringCellValue();
	  
	  String mailId=sh.getRow(3).getCell(4).getStringCellValue();
	  
	  System.out.println(name);
	  System.out.println(phoneNo);
	  System.out.println(mailId);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //HSSFWorkbook
	 /* HSSFWorkbook wb=new HSSFWorkbook(file);
	  
	  HSSFSheet sh=wb.getSheetAt(0);
	  
	  System.out.println(sh.getLastRowNum());
	  
	  System.out.println(sh.getRow(0).getCell(0).getStringCellValue());*/
	 
	  //Assert.fail("Failed");
	  
  }
}
