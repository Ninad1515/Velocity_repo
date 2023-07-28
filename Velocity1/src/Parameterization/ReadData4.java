package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData4 {

	public static void main(String[] args) throws IOException {
         
		
		String file="C:\\Users\\Ninad\\eclipse-workspace\\Velocity1\\Test\\StudentInfo.xlsx";
		
		FileInputStream file1=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		
	     XSSFSheet sheet=workbook.getSheetAt(3);
	     
	     int Rows=sheet.getLastRowNum();
	     System.out.println(Rows);
	     
	     int Column=sheet.getRow(1).getLastCellNum();
	     System.out.println(Column);
	     
	     for(int R=0;R<Rows;R++) {
	    	 XSSFRow row=sheet.getRow(R);
	    	 
	    	 
	    	 for(int C=0;C<Column;C++) {
	    		 XSSFCell cell=row.getCell(C);
	    		 
		    	 

	    		 
	    		 switch(cell.getCellType()) {
	    		 case STRING:System.out.print(cell.getStringCellValue());
	    		 break;
	    		 
	    		 case NUMERIC:System.out.print(cell.getNumericCellValue());
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    		 }
	    		 
	    		 System.out.print("||");
	    	 }
	    	 System.out.println("  ");

	     }
    	 System.out.println("");

	}

}
