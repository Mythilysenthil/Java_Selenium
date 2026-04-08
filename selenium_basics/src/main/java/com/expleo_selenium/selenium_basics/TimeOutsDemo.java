package com.expleo_selenium.selenium_basics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TimeOutsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriver driver1 = new ChromeDriver(options);

        driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver1.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver1.get("https://omayo.blogspot.com/");

        driver1.get("https://omayo.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeAsyncScript(
                "var callback = arguments[arguments.length - 1];" +
                "window.setTimeout(callback, 3000);"
        );

        System.out.println("Page loaded and script executed successfully");

        driver1.quit();
	}

}