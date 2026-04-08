package com.expleo_selenium.selenium_basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  ExplicitWait{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        WebElement reveal=driver.findElement(By.cssSelector("input#reveal"));
        reveal.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement revealed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#revealed")));
       
        System.out.println(revealed.getAttribute("value"));

        driver.quit();
	}
}
