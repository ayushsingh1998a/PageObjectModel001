package com.ResalesforceExample.base;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {	
	public static ArrayList getData(String filePath) {
		ArrayList data = new  ArrayList();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowItr = sheet.rowIterator();
			while (rowItr.hasNext()) {
				Row row = (Row) rowItr.next();
				Iterator<Cell> cellItr = row.cellIterator();
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					data.add(cell.getStringCellValue());
				}
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
}

