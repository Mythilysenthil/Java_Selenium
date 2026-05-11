package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://pdf2doc.com/");
    WebElement file=driver.findElement(By.xpath("//span[text()='UPLOAD FILES']"));
    file.click();
   
    Runtime.getRuntime().exec("\"C:\\Users\\Navee\\OneDrive\\Documents\\autoit_demo.exe\"");
    
   
	}

}