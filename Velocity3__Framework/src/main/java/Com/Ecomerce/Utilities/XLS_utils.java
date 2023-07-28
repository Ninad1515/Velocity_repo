package Com.Ecomerce.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLS_utils {
	
	public static FileInputStream fi;
	public static XSSFWorkbook Wb;
	public static XSSFSheet Xs;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static int GetRowcount(String xfile, String Xsheet) throws IOException {
		
		fi=new FileInputStream(xfile);
		Wb=new XSSFWorkbook(fi);
		Xs=Wb.getSheet(Xsheet);
		int rowcount=Xs.getLastRowNum();
		fi.close();
		
		return rowcount;
		
	}

	public static int getcellcount(String xfile,String Xsheet,int rownum) throws IOException {
		
		fi=new FileInputStream(xfile);
		Wb=new XSSFWorkbook(fi);
		Xs=Wb.getSheet(Xsheet);
		row=Xs.getRow(rownum);
		int cellcount=row.getLastCellNum();
		Wb.close();
		fi.close();
		
		return cellcount;
		
		
		
	}
	public static String getcelldata(String xfile,String Xsheet,int rownum,int column) throws IOException {
		fi=new FileInputStream(xfile);
		Wb=new XSSFWorkbook(fi);
		Xs=Wb.getSheet(Xsheet);
		row=Xs.getRow(rownum);
		
		cell=row.getCell(column);
		
		String data;
		
		try {
		DataFormatter Formater=new DataFormatter();
		
		String celldata=Formater.formatCellValue(cell);
		return celldata;
		}
		catch (Exception e) {
			
			data="";
		}
		Wb.close();
		fi.close();
		
		return data;
		
		
	}
	
}
