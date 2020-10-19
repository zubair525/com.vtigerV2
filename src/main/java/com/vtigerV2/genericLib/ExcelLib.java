package com.vtigerV2.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelLib {
	
	public void getExcelData() throws Throwable {
		FileInputStream fis=new FileInputStream(IConstant.ExcelDatapath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		for(int i=0;i<=lastRowNum;i++) {
			
		}
		}
	/**
	 * This method is used to fetch the excel data based on
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return cell value in the form of String.
	 * @throws Throwable
	 */
	public String getExcelData(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis=new FileInputStream("./testdata/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}
	}