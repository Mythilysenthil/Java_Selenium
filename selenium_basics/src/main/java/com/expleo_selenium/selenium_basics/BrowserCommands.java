package com.expleo_selenium.selenium_basics;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        System.out.println("Page titel is:" +driver.getTitle());
        System.out.println("Page titel length is:" +driver.getTitle().length());
        System.out.println("Current URL is:" +driver.getCurrentUrl());
        //System.out.println("Page source is:" +driver.getPageSource());
        driver.close();
	}

}