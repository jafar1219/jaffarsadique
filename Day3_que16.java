package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_que16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("https://www.swiggy.com/");
		WebElement signup = e.findElement(By.className("r2iyh"));
		signup.click();
		WebElement mob = e.findElement(By.id("mobile"));
		mob.sendKeys("8015339977");
		WebElement name = e.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("jaffar");
		WebElement email = e.findElement(By.id("email"));
		email.sendKeys("jaffy71@gmail.com");
		WebElement pass = e.findElement(By.id("password"));
		pass.sendKeys("passw");
		WebElement continu= e.findElement(By.className("a-ayg"));
		continu.click();
	}
}
