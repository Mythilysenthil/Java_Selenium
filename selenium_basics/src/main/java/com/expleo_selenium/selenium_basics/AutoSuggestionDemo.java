package com.expleo_selenium.selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://leafground.com/select.xhtml");
        
        WebElement searchBox = driver.findElement(By.id("j_idt87:auto-complete_input"));
        searchBox.sendKeys("AWS",Keys.ENTER);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        List<WebElement> suggestions = wait.until(
        		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#j_idt87\\:auto-complete_panel ul li")));
        
        for(WebElement option: suggestions) {
        	System.out.println(option.getText());
        	if(option.getText().equals("selenium webdriver") || 
        			option.getText().equals("AWS") || 
        			option.getText().equals("Appium")) {
        		option.click();
        		break;
        	}
        }
	}

}
