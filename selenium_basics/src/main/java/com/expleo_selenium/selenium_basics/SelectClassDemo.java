package com.expleo_selenium.selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://leafground.com/select.xhtml");

        WebElement UIAutomation = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

        Select dropdown = new Select(UIAutomation);

        List<WebElement> list1 = dropdown.getOptions();

        System.out.println("The drop down options size: " + list1.size());

        for (WebElement option : list1) {
            System.out.println("Option: " + option.getText());
        }

        Boolean multiple = dropdown.isMultiple();
        System.out.println("Multiple options available: " + multiple);

        dropdown.selectByIndex(1);
        dropdown.selectByVisibleText("Puppeteer");

        driver.quit();
    }
}
