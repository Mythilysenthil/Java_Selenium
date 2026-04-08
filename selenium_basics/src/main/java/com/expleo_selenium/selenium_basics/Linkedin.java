package com.expleo_selenium.selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        WebElement name=driver.findElement(By.cssSelector("#username"));
        name.sendKeys("2k22eee56@kiot.ac.in",Keys.ENTER);
        WebElement pass=driver.findElement(By.cssSelector("#password"));
        pass.sendKeys("Kiot@1234",Keys.ENTER);
        driver.close();
	}
}
