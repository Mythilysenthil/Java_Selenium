package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium_Locator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        WebElement email = driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
        WebElement aboveElement = driver.findElement(with(By.tagName("input")).above(email));
        Thread.sleep(5000);
        System.out.println("Above to Email: " + aboveElement.getAttribute("name"));
        

        driver.quit();
    }
}