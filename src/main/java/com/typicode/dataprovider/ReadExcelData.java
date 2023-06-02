package com.typicode.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("serial")
public class ReadExcelData {
	public static LinkedHashMap<String, String> read_hashmap = new LinkedHashMap<String, String>();

	public static LinkedHashMap readExcel(final String testcasename) throws IOException {
		try {
			FileInputStream file = new FileInputStream(new File(
					System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "Typicode.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook((InputStream) file);
			XSSFSheet mySheet = workbook.getSheet("TestData");

			int cellCount = 0;
			Iterator rowIterator = mySheet.rowIterator();
			int rowCount = mySheet.getPhysicalNumberOfRows();

			if (rowIterator.hasNext()) {
				Row headerRow = (Row) rowIterator.next();
				cellCount = headerRow.getPhysicalNumberOfCells();

				for (int i = 1; i < rowCount; i++) {
					if (mySheet.getRow(i).getCell(0).getStringCellValue().equals(testcasename)) {
						for (int k = 0; k < cellCount; k++) {
							read_hashmap.put(mySheet.getRow(0).getCell(k).getStringCellValue(),
									mySheet.getRow(i).getCell(k).getStringCellValue());
						}
						// test.log(LogStatus.PASS, "Able to read data from excel file");
						// CustomTestLogger.writePass("Able to read data from excel file", true);
						// System.out.println(properties);
						// return read_hashmap;
					}
				}
			}
		}

		catch (Exception e) {
			// test.log(LogStatus.FAIL, "Read Excel error " + e);
			// CustomTestLogger.writeFailure("Read Excel error " + e, true);
		}
		return read_hashmap;
	}
}
