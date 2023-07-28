package Assiagnments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5_ {

	public static void main(String[] args) throws IOException {
		String path= "C:\\\\Users\\\\Ninad\\\\Desktop\\\\DATA2.xlsx";
        FileInputStream file = new FileInputStream(path);

        //1. Print the HR Manger value from excel sheet.
      String data2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
      System.out.println(data2);

//2. Print all the data using Switch statement
        FileInputStream file1 = new FileInputStream(path);

        XSSFWorkbook work= new XSSFWorkbook(file1);
        XSSFSheet Sheet = work.getSheetAt(0);

        int RowSize= Sheet.getLastRowNum();
        System.out.println(RowSize);
        int CellSize= Sheet.getRow(2).getLastCellNum();
         System.out.println(CellSize);
        for(int R=0;R<RowSize;R++) {
                XSSFRow row =Sheet.getRow(R);

                for(int C=0;C<CellSize;C++) {
                        XSSFCell cell =row.getCell(C);

                        switch(cell.getCellType()) {
                        case NUMERIC:
                                System.out.print(cell.getNumericCellValue());
                                break;
                        case STRING:
                                System.out.print(cell.getStringCellValue());
                                break;
                        default:
                                break;

        }
                        System.out.print("   ||   ");

        }
                System.out.println();

        }
        
        
}


	}


