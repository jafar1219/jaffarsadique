package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel2 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("http://www.greenstechnologys.com/");
		Thread.sleep(4000);
		WebElement first = e.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));
		Actions ac=new Actions(e);
		ac.doubleClick(first).perform();
}}
