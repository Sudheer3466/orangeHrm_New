import utilities.Excel_Utils;

public class DataProvider {


	@DataProvider(name="LoginData")
	public static String  [][]  getData() {
		String file=C:"\\Users\\Malyadri Reddy\\eclipse-workspace\\orangeHrm_New\\testData\\Book1.xlsx";
		int rows=Excel_Utils.getRowCount(file, "Sheet1");
		int cells=Excel_Utils.getCellCount(file,"Sheet1", 1);
		
		String loginData[][]=new String[rows][cells];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				
				loginData[i-1][j]=Excel_Utils.readDataFromCells(file, "Sheet1",i,j)
				
			}
			return loginData;
			
			
			

		}




	}
}
