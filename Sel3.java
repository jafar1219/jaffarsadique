package org.mavennew.mavennew1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("http://www.greenstechnologys.com/");
		TakesScreenshot tk=(TakesScreenshot)e;
		File s = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d = new File("E:\\New folder\\fb.png");
		FileUtils.copyFile(s, d);
	}
}
