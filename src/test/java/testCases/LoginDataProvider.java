package testCases;


import java.io.IOException;

import org.testng.annotations.DataProvider;

import utilities.Excel_Utils;

public class LoginDataProvider {

	@DataProvider(name="LoginData")
	public static String [][]  getData() throws IOException {
		String file="C:\\Users\\Malyadri Reddy\\eclipse-workspace\\orangeHrm_New\\testData\\Book1.xlsx";

	//	Excel_Utils.readDataFromCells(file, "Sheet1", 1, 2);

		int rows=Excel_Utils.getRowCount(file, "Sheet1");
		int cells=Excel_Utils.getCellCount(file,"Sheet1", 1);



		String loginData[][]=new String[rows][cells];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {

				loginData[i-1][j]=Excel_Utils.readDataFromCells(file,"Sheet1", i, j);

			}
				
	}
		return loginData;
}
	
}