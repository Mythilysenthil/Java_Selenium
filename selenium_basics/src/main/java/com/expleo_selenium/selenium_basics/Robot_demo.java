package com.expleo_selenium.selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_demo {
	public static void main(String[] args) throws InterruptedException, AWTException {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://pdf2doc.com/");
     driver.manage().window().maximize();

     Thread.sleep(3000);
     WebElement upload = driver.findElement(By.xpath("//span[text()='UPLOAD FILES']"));
     upload.click();
     Thread.sleep(2000);

     StringSelection filepath = new StringSelection("\"C:\\Users\\Navee\\OneDrive\\Documents\\autoit_demo.exe\"");

     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

     Robot rb = new Robot();

     Thread.sleep(2000);

     // Press CTRL + V
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);

     rb.keyRelease(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);

     Thread.sleep(1000);

     // Press ENTER
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);

     Thread.sleep(8000);

     System.out.println("File Uploaded Successfully");

     driver.quit();
	}
}