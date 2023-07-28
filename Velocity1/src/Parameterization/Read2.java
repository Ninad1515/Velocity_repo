package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read2 {

	public static void main(String[] args) throws IOException {

		
		   String Path="C:\\Users\\Ninad\\Desktop\\Firstname.xlsx";
		   
		   FileInputStream file= new FileInputStream(Path);
		   
		   XSSFWorkbook workbook= new XSSFWorkbook(file);
		   
		   String data= workbook.getSheetAt(0).getRow(2).getCell(0).getStringCellValue();
		   
		   System.out.println(data);
	}

}
