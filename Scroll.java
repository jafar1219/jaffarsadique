package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("https://www.facebook.com/");
		WebElement developers = e.findElement(By.xpath("//a[contains(text(),'Developers')]"));
		WebElement top = e.findElement(By.xpath("//div[@class='_52lr fsm fwn fcg']"));
	JavascriptExecutor jk=(JavascriptExecutor)e;
	jk.executeScript("arguments[0].scrollIntoView(true)", developers);
	jk.executeScript("arguments[0].scrollIntoView(false)", top);
	}}
