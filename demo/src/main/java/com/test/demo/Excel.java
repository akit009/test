package com.test.demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class  Excel { 
		public static final String SAMPLE_XLSX_FILE_PATH = "/home/administrator/Desktop/demo.xlsx";
		public static void main(String[] args) throws IOException, InvalidFormatException {
			 Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
//		        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		        Sheet sheet = workbook.getSheetAt(0);
		        DataFormatter dataFormatter = new DataFormatter();
		        Iterator<Row> rowIterator = sheet.rowIterator();
		        while (rowIterator.hasNext()) {
		            Row row = rowIterator.next();

		            // Now let's iterate over the columns of the current row
		            Iterator<Cell> cellIterator = row.cellIterator();

		            while (cellIterator.hasNext()) {
		                Cell cell = cellIterator.next();
		                String cellValue = dataFormatter.formatCellValue(cell);
		                System.out.print(cellValue + "\t");
		            }
		            System.out.println();
		        }

		        

		}


	}

