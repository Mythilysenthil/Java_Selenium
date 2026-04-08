package com.expleo_selenium.selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElementActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Actions act = new Actions(driver);
        WebElement compendiumDevlink = driver.findElement(By.linkText("compendiumdev"));
        act.keyDown(Keys.CONTROL).moveToElement(compendiumDevlink).click().keyUp(Keys.CONTROL);
        String parent = driver.getWindowHandle();
        Set<String> windowhandle = driver.getWindowHandles();
        for(String handle:windowhandle) {
        	driver.switchTo().window(handle);
        }
        Thread.sleep(3000);
        System.out.println("Child window is " +windowhandle);
        driver.switchTo().window(parent);
	}

}
