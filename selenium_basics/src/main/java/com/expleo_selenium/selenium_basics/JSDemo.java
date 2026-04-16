package com.expleo_selenium.selenium_basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        String Fname = js.executeScript(
        		"document.getElementsByTagName('input')[0].value='Mythily'; return document.getElementsByTagName('input')[0].value;"
        		).toString();

        System.out.println(Fname);

        String Lname = js.executeScript(
        		"document.getElementsByTagName('input')[1].value='S'; return document.getElementsByTagName('input')[1].value;"
        		).toString();

        System.out.println(Lname);
        
        
        String email = js.executeScript(
        		"document.getElementsByTagName('input')[2].value='mythily@gmail.com'; return document.getElementsByTagName('input')[2].value;"
        		).toString();

        System.out.println(email);
        
        String pass = js.executeScript(
        		"document.getElementsByTagName('input')[3].value='mythily'; return document.getElementsByTagName('input')[3].value;"
        		).toString();

        System.out.println(pass);
        
        
        String repass = js.executeScript(
        		"document.getElementsByTagName('input')[4].value='mythily'; return document.getElementsByTagName('input')[4].value;"
        		).toString();

        System.out.println(repass);
        
        js.executeScript("document.getElementsByTagName('button')[1].click();");
        
	}

}
