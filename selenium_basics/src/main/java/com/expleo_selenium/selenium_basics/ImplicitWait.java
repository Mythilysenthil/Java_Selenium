package com.expleo_selenium.selenium_basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement addbox=driver.findElement(By.cssSelector("input#adder"));
        addbox.click();
        WebElement red=driver.findElement(By.cssSelector(".redbox"));
        System.out.println("Height of the box is : "+red.getCssValue("height"));
        
        
	}
}
