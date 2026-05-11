package com.expleo_selenium.selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadFile_download {

	public static void main(String[] args) {
		String downloadFilePath=System.getProperty("user.dir") + File.separator + "downloads";
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		WebElement downloadlink= driver.findElement(By.xpath("//a[@type='button']"));
		downloadlink.click();
		File downloadFile = new File(downloadFilePath 
		        + File.separator + "samplefile.pdf");	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(wd -> downloadFile.exists());
		if(downloadFile.exists()) {
			System.out.println("File is downloaded!");
		}
		else {
			System.out.println("File is not downloaded");
		}
		PDDocument document=null;
  try {
	  document=Loader.loadPDF(downloadFile);
	  PDFTextStripper pdfStripper = new PDFTextStripper();
	  String text=pdfStripper.getText(document);
	  document.close();
	  System.out.println("Text in PDF: ");
	  System.out.println(text);
	  
  }
  catch(IOException e) {
	  System.err.println("An error occured while loading or reading the PDF file: "+e.getMessage());
	  e.printStackTrace();
	  }
	}

}