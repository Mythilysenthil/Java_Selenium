package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://omayo.blogspot.com/");
       WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
       Actions act = new Actions(driver); 
       act.moveToElement(blogsmenu).perform();
       
       //WebElement option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
       //act.moveToElement(option2).click().build().perform();
       
       WebElement search = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
       act.contextClick(search).perform();
      
	}

}
