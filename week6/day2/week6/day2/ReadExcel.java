package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// Setup the path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		// Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(0);
		
		// to get the number of rows with data
		int rowCount = ws.getLastRowNum();
//		int allRowsCount = ws.getPhysicalNumberOfRows();
		
		// to get the number of columns with data
		int cellCount = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
		// Get into the specific row
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		
		
//		XSSFRow row = ws.getRow(1);
//		
//		// Get into the sepcific cell
//		XSSFCell cell = row.getCell(0);
//		
//		// Read the data from the cell
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		
		// Close the Workbook
		wb.close();
		
		return data;
		
	}

}
