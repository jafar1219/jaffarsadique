package org.mavennew.mavennew1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadUpdate {
	public static void main(String[] args) throws IOException {
		File loc =new File("C:\\Users\\jaff\\workspace\\mavennew1\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String name = c.getStringCellValue();
		if (name.equals("name")) {
			c.setCellValue("Baskaran"); 
		}
	FileOutputStream o=new FileOutputStream(loc);
	w.write(o);
	}}