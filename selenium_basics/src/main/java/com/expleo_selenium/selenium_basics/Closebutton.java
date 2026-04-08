package com.expleo_selenium.selenium_basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Closebutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implictlyWait(10,TimeUnit.SECONDS);
        driver.get("https://leafground.com/window.xhtml");
        
        driver.findElement(By.id("//span[text()='Close Windows']")).click();
        
        
        
        driver.close();
	}

}
