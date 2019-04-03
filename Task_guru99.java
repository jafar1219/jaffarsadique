package org.mavennew.mavennew1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("https://www.guru99.com/");
		List<WebElement> allheading = e.findElements(By.tagName("b"));
		for (WebElement a : allheading) {
			System.out.println(a.getText());
		}
		List<WebElement> testing = e.findElements(By.xpath("(//ul[@class='menu'])[1]"));
		for (WebElement b : testing) {
			System.out.println();
			System.out.println(b.getText());
		}
			List<WebElement> bigdata = e.findElements(By.xpath("(//ul[@class='menu'])[10]"));
		for (WebElement c : bigdata) {
			System.out.println();
			System.out.println(c.getText());
	}}}
