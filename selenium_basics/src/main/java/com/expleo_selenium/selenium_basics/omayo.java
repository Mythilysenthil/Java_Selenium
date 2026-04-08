package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
		
		WebElement a = driver.findElement(By.cssSelector("button.dropbtn"));
		a.click();	
		
		Thread.sleep(5000);
		
		WebElement b = driver.findElement(By.cssSelector("div#myDropdown>a:last-child"));
		
		
		b.click();
		
		driver.close();
		
	}
}
