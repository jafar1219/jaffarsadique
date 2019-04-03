package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysJS {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
	WebDriver e=new ChromeDriver();
	e.get("https://www.facebook.com/");
	WebElement user = e.findElement(By.id("email"));
	WebElement pass = e.findElement(By.id("pass"));
	JavascriptExecutor jk=(JavascriptExecutor)e;
	jk.executeScript("arguments[0].setAttribute('value','jaffy71@gmail')", user);
	jk.executeScript("arguments[0].setAttribute('value','jkd')", pass);
	




}
}
