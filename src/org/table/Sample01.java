package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample01 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium_workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement Table = driver.findElement(By.id("customers"));
		// To get rows from table
	   List<WebElement> elements = Table.findElements(By.tagName("tr"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement Rows = elements.get(i);
			String text = Rows.getText();
			System.out.println(text); } 
		// To get headers from table
			List<WebElement> Headers = Table.findElements(By.tagName("th"));
			for (WebElement X : Headers) {
				String text2 = X.getText();
				System.out.println(text2);
		
			}
			
		}
	}


