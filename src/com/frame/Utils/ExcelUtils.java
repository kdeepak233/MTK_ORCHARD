package com.frame.Utils;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	DataFormatter df= new DataFormatter();
	public ExcelUtils() throws Exception
	{
		fis = new FileInputStream(new File("excel.xlsx"));
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	public String getCellData(int index, int colNum, int rowNum)
	{
		sheet=workbook.getSheetAt(index);
		String x=df.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		return x;
	}
	
	public int findLength(int i) {
		sheet = workbook.getSheetAt(i);
		int row=sheet.getLastRowNum();
		return row ;
	}
}

//https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default