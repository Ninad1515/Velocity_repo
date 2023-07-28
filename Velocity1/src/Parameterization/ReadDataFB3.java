package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFB3 {

	public static void main(String[] args) throws IOException {
              
		FileInputStream File=new FileInputStream("C:\\Users\\Ninad\\Desktop\\StudentInfo.xlsx");
		  
		 String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 
		 System.out.println(Data);
		 
		 
		 FileInputStream File1=new FileInputStream("C:\\Users\\Ninad\\Desktop\\StudentInfo.xlsx");
		  
		 String Data1 = WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 
		 System.out.println(Data1);		 
		 
		 
		 FileInputStream File2=new FileInputStream("C:\\Users\\Ninad\\Desktop\\StudentInfo.xlsx");
		  
		 String Data2 = WorkbookFactory.create(File2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 
		 System.out.println(Data2);
		 
		 
		 FileInputStream File3=new FileInputStream("C:\\Users\\Ninad\\Desktop\\StudentInfo.xlsx");
		  
		 double Data3 = WorkbookFactory.create(File3).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		 
		 System.out.println(Data3);
	        
		 
		 FileInputStream File4=new FileInputStream("C:\\Users\\Ninad\\Desktop\\StudentInfo.xlsx");
		  
		 boolean Data4 = WorkbookFactory.create(File4).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		 
		 System.out.println(Data4);
	}

}
