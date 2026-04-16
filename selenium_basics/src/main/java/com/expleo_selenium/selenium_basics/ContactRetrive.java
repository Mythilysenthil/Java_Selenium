package com.expleo_selenium.selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ContactRetrive {

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
        
        String expectedNames = "Mythily S";
        List<WebElement> contactNames = driver.findElements(
                By.xpath("//table[@id='myTable']//tr/td[2]")
        );
        int contactCount = contactNames.size();
        System.out.println("Total contact count: "+contactCount);
        
        for(WebElement name:contactNames) {
        	System.out.println(name.getText());
        }
        
        int i=1;
        for(WebElement name:contactNames) {
        	if(name.getText().equals(expectedNames)) {
        		List<WebElement> actualRowData = driver.findElement(By.xpath("//table[@id='myTable']/tr[" +i+ "]"));
        		for(WebElement)
        	}
        }
	}

}
