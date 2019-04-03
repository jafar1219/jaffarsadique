package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("http://www.amazon.in");
		Thread.sleep(4000);
		WebElement shop = e.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
		Actions acc=new Actions(e);
		acc.moveToElement(shop).perform();
		WebElement mobile = e.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
		acc.moveToElement(mobile).perform();
		WebElement watch = e.findElement(By.xpath("//span[contains(text(),'Watches')]"));
		watch.click();
	}

}
