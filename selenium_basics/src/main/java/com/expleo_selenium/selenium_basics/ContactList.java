package com.expleo_selenium.selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("mythily@gmail.com",Keys.ENTER);
        WebElement pass = driver.findElement(By.cssSelector("#password"));
        pass.sendKeys("mythily",Keys.ENTER);
        
        Thread.sleep(3000);
        List <WebElement>table = driver.findElements(By.cssSelector(".contactTableBodyRow"));
        for(WebElement value : table) {
        	System.out.println(value.getText());
        }
        
	}

}
