package org.mavennew.mavennew1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFormat {
	public static void main(String[] args) throws IOException {
		File loc= new File("C:\\Users\\jaff\\workspace\\mavennew1\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		Date d=new Date(12-01-1993);
				System.out.println(d);
			SimpleDateFormat s1=new SimpleDateFormat("dd-mmm-yy");
			String name = s1.format(d);
			System.out.println(name);
			
	}
		
	}
	}

}
