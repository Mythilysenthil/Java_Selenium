package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        WebElement simple = driver.findElement(By.xpath("//input[@id='alert1']"));
        simple.click();
        
        Alert a = driver.switchTo().alert();
        a.accept();
       
	}

}
