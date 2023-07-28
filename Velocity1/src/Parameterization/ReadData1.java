package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws IOException {
		
		
              
		     String Path="C:\\Users\\Ninad\\Desktop\\Firstname.xlsx";
		     
		     FileInputStream File=new FileInputStream(Path);
		     
		     XSSFWorkbook WB=new XSSFWorkbook(File);
		     
		     String D= WB.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		     System.out.println(D);
		    		 
	}

}
