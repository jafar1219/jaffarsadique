package org.mavennew.mavennew1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel1 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaff\\workspace\\Selenium4\\drivers\\chromedriver.exe");
		WebDriver e=new ChromeDriver();
		e.get("https://www.facebook.com/");
WebElement email = e.findElement(By.id("email"));
Actions ac=new Actions(e);
ac.keyDown(email,Keys.SHIFT).sendKeys(email,"be it in caps").keyUp(Keys.SHIFT).perform();

}
}