package Assiagnments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5 {

	public static void main(String[] args) throws IOException {
		  String Path="C:\\Users\\Ninad\\Desktop\\E2.xlsx";
		   
		   FileInputStream file= new FileInputStream(Path);
		   
		   XSSFWorkbook workbook= new XSSFWorkbook(file);
		   
		   String data= workbook.getSheetAt(0).getRow(3).getCell(3).getStringCellValue();
		   
		   System.out.println("Print The HR Manager Value= "+data);
		   
		   
		   System.out.println("****************");
		   
		    
		   XSSFSheet sheet=workbook.getSheetAt(0);

		   
		   int Rows=sheet.getLastRowNum();
		     System.out.println(Rows);
		     
		     int Column=sheet.getRow(2).getLastCellNum();
		     System.out.println(Column);
		     
		     for(int R=0;R<Rows;R++) {
		    	 XSSFRow row=sheet.getRow(R);
		    	 
		    	 System.out.println();
		    	 
		    	 
		    	 for(int C=0;C<Column;C++) {
		    		 XSSFCell cell=row.getCell(C);
		    		 
			    	 

		    		 
		    		 switch(cell.getCellType()) {
		    		 case STRING:System.out.print(cell.getStringCellValue());
		    		 break;
		    		 
		    		 case NUMERIC:System.out.print(cell.getNumericCellValue());
		    		 break;
		    		 
		    		 default:
		    			 break;
		   
         
		    		 
		    		 
		    		 
	}
		    		 System.out.print("||");

}
		    	// System.out.println("  ");

		    	 
		     }
	    	 System.out.println(" ");

	}
}
