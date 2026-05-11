package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload_sendkey {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");
        WebElement upload =driver.findElement(By.id("uploadFile"));
        upload.sendKeys("C:\\Users\\Navee\\OneDrive\\Documents\\autoit_demo.exe");
        String message =driver.findElement(By.id("uploadedFilePath")).getText();
        System.out.println("Message: " + message);

        driver.quit();
    }
}