package com.expleo_selenium.selenium_basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//For Login
		driver.findElement(By.id("login2")).click();

		WebElement name = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		name.sendKeys("admin");

		WebElement pass = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword"))); 
		pass.sendKeys("admin");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		String expected = "Welcome admin"; 

		WebElement loginText = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

		String actual = loginText.getText();

		if (actual.equals(expected)) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}


		//for Category Navigate
		Actions action = new Actions(driver);

		WebElement laptops = wait.until(
		        ExpectedConditions.elementToBeClickable(By.linkText("Laptops")));
		action.moveToElement(laptops).click().perform();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(
		        By.cssSelector(".card-title a"), "Sony vaio"));

		List<WebElement> products = driver.findElements(By.cssSelector(".card-title a"));

		List<String> productList = new ArrayList<>();
		for (WebElement product : products) {
		    productList.add(product.getText());
		}

		Collections.sort(productList);

		for (String title : productList) {
		    System.out.println("Found Laptop: " + title);
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		boolean found = false;

		for (WebElement product : products) {
		    if (product.getText().equalsIgnoreCase("MacBook Pro")) {

		        js.executeScript("arguments[0].scrollIntoView(true);", product);

		        System.out.println("MacBook Pro is displayed");
		        found = true;
		        break;
		    }
		}

		if (!found) {
		    System.out.println("MacBook Pro not found");
		}
		
		
		//Add Product to cart		
		
		WebElement mac = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook Pro']")));
		mac.click();
		
		WebElement add = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
		add.click();
        
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Alert handled successfully.");

		WebElement cart = wait.until(
		        ExpectedConditions.elementToBeClickable(By.id("cartur")));
		cart.click();

		WebElement productTitle = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]")));
		String title = productTitle.getText();
		
		WebElement productPrice = driver.findElement(By.xpath("//td[3]"));
		String price = productPrice.getText();

		if (title.equalsIgnoreCase("MacBook Pro")) {
		    System.out.println("Product added to cart");
		    System.out.println("MacBook Pro added to cart.");
		} else {
		    System.out.println("Product not added correctly");
		}
        
		
		//Place Order
		
		WebElement placeorder = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		placeorder.click();
		
		WebElement Pname = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		Pname.sendKeys("Mythily");
		
		WebElement country = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		country.sendKeys("India");
		
		WebElement city = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("city")));
		city.sendKeys("Salem");
		
		WebElement credit = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("card")));
		credit.sendKeys("123456789123456");
		
		WebElement mon = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		mon.sendKeys("April");
		
		WebElement year = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("year")));
		year.sendKeys("2026");
		
		WebElement purchase = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Purchase']")));
		purchase.click();
		
		WebElement confirmMsg = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sweet-alert.showSweetAlert.visible")));

		String purchaseText = confirmMsg.getText();

		if (purchaseText.contains("Id")) {
		    System.out.println("Order is placed successfully");
		    System.out.println(purchaseText);
		    System.out.println("Alert handled successfully.");

		} else {
		    System.out.println("Order is Unsuccessful");
		}
		
		driver.quit();
	}
}