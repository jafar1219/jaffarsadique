package org.mavennew.mavennew1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7que2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("https://www.toolsqa.com/");
		WebElement tutorials = e.findElement(By.xpath("(//div[@class='widget-title'])[3]"));
		JavascriptExecutor jk=(JavascriptExecutor)e;
		jk.executeScript("arguments[0].scrollIntoView(true)", tutorials);
		TakesScreenshot tk=(TakesScreenshot)e;
		File s = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(s);
	File d = new File("C:\\Users\\jaff\\Desktop\\New folder\\jjjjk.jpg");
	FileUtils.copyFile(s, d);
	}

}
