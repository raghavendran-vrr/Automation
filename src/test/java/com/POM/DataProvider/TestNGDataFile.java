package com.POM.DataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNGDataFile {

	public static String[][] readxl(String excelfileName, String excelSheetName) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wBook = new XSSFWorkbook("./Utilities/" + excelfileName);
		XSSFSheet sheet = wBook.getSheet(excelSheetName);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowcount][colcount];

		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}

		wBook.close();

		// return to the data provider
		return data;
	}

}
