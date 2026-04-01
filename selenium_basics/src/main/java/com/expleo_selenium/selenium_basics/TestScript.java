package com.expleo_selenium.selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("Selenium",Keys.ENTER);
        System.out.println("Page titel is:" +driver.getTitle());
        driver.close();
	}

}
