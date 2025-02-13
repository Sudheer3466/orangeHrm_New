package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Excel_Dupe {
	public FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;



	public static  int getRowCount(String file,String SheetName) throws IOException {
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Book1.xlsx");
		wb=new XSSFWorkbook(file);
		sh=wb.getSheet(SheetName);
		row=sh.getRow(0);
		int numberOfRows=sh.getLastRowNum();

		System.out.println(numberOfRows);
		wb.close();
		fi.close();

		return numberOfRows;
	}

	public static  int getCellCount(String file,String SheetName,int rowNumber) throws IOException {
		FileInputStream fi=new FileInputStream(file);
		wb=new XSSFWorkbook(file);
		sh=	wb.getSheet(SheetName);
		int CellCount=sh.getRow(rowNumber).getLastCellNum();
		return CellCount;

	}
	public static String readDataFromCells(String file,String SheetName,int rowNumber,int cellNumber) throws IOException {


		FileInputStream fi=new FileInputStream(file);
		wb=new XSSFWorkbook(file);
		sh=wb.getSheet(SheetName);
		String cellData=sh.getRow(rowNumber).getCell(cellNumber).toString();
		return cellData;


	}
}



