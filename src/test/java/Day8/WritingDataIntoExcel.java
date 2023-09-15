package Day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	//Excel File-->Workbook-->Sheets---->Rows--->Cells
		public static void main(String[] args) throws IOException 
		
		{
			
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile.xlsx" );	
			
		XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet =workbook.createSheet();
	
	//create row ,cell and update data without loops
	
	/*XSSFRow row1=sheet.createRow(0);
	
	row1.createCell(0).setCellValue("Welcome");
	row1.createCell(1).setCellValue("12345");
	row1.createCell(2).setCellValue("xyz");
	
   XSSFRow row2=sheet.createRow(1);
	
	row2.createCell(0).setCellValue("Welcome Java");
	row2.createCell(1).setCellValue("67867");
	row2.createCell(2).setCellValue("abc");*/
	
	//create row ,cell and update data with loops
	
	Scanner sc=new Scanner(System.in);
	
	for(int r=0;r<=3;r++)
	{
		XSSFRow Currentrow = 	sheet.createRow(r);
		
		for(int c=0;c<2;c++)
		{
		//Currentrow.createCell(c).setCellValue("Welcome");
		
		System.out.println("Enter the value  ");
		String value =sc.next();
		Currentrow.createCell(c).setCellValue(value);
			
		}		
	}
	workbook.write(file);
	workbook.close();
	file.close();
	
	System.out.println("Writing is done!!!");
}
}