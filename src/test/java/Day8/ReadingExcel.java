package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	//Excel File-->Workbook-->Sheets---->Rows--->Cells
	public static void main(String[] args) throws IOException {
		
FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\TestData\\data.xlsx");
		
      XSSFWorkbook workbook=new XSSFWorkbook(file);
      XSSFSheet  sheet = workbook.getSheet("Sheet1");
      
     int row =sheet.getLastRowNum();//total no of rows
   int col = sheet.getRow(1).getLastCellNum();//total no of col
   
   System.out.println("The no of rows " +row); //5
   System.out.println("The no of col " +col); //4
   
   for(int r=0;r<=row;r++)
   {
     XSSFRow currentRow =sheet.getRow(r);
     
     for(int c=0;c<col;c++)
     {
//    	 XSSFCell cell =currentRow.getCell(c);
//    	String value = cell.toString();
    	 
    	 String value=currentRow.getCell(c).toString();
     
    	System.out.print(value +"    ");
     }
     
     System.out.println(" ");
   }
   
   workbook.close();
   file.close();
      	
	}
}
