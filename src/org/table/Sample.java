package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium_workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		
		// To fetch the Rows from table
		List<WebElement> Rows = table.findElements(By.tagName("tr"));
		// To iterate the rows from table
		for (int i = 0; i < Rows.size(); i++) {
			//to get the rows one by one
			WebElement element = Rows.get(i);
			//To get the text from WebElement
			String string = element.getText();
			System.out.println(string);
			
		}
	}

}
