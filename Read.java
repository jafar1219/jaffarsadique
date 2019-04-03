package org.mavennew.mavennew1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws IOException {
		File loc= new File("C:\\Users\\jaff\\workspace\\mavennew1\\excel\\newcreate.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		Row r = s.createRow(2);
		Cell c = r.createCell(0);
			c.setCellValue("selenium");
		FileOutputStream k=new FileOutputStream(loc);
		w.write(k);
		System.out.println("done");
	}}
	
