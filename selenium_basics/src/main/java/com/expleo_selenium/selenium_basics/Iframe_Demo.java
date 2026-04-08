package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframe_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        
        WebElement iframeElement = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframeElement);
        String Frame_1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Switch by locator: "+Frame_1);
        
        driver.switchTo().defaultContent();
        String mainPage = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
        System.out.println("Back to Main page: "+mainPage);
        
        driver.switchTo().frame(1);
        String Frame_2 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Switch by locator: "+Frame_2);
        
        driver.close();
	}

}
