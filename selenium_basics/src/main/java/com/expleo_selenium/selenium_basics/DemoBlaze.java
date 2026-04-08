package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DemoBlaze {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.cssSelector("a#login2")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        username.sendKeys("admin");
        WebElement password = wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        password.sendKeys("admin");
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='logIn()']")));
        signIn.click();
        
}
}