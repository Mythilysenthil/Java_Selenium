package com.expleo_selenium.selenium_basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowSwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implictlyWait(10,TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String>allWindowHandles = driver.getWindowHandles();
        System.out.println("Count of Window : "+allWindowHandles.size());
        
        driver.findElement(By.id("windowButton")).click();
        
        Set<String>newAllWindowHandles = driver.getWindowHandles();
        System.out.println("new count of windows: "+newAllWindowHandles.size());
        
        String ParentHandle = driver.getWindowHandle();
        System.out.println("Parent window: "+ParentHandle);
        
        Iterator<String> iterator = newAllWindowHandles.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
        System.out.println("Parent window: "+mainWindow);
        System.out.println("The child window: "+childWindow);
        
        driver.switchTo().window(childWindow);
        
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println("Child_Title: "+text.getText());
        
        driver.close();
        
        driver.switchTo().window(ParentHandle);
        System.out.println("Parent titel: "+driver.getTitle());
        
        driver.close();
	}

}
