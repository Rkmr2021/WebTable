package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample04 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2021/08");
		WebElement Table = driver.findElement(By.id("customers"));
		//to fetch rows from table
		List<WebElement> Rows = Table.findElements(By.tagName("tr"));
		System.out.println(Rows.size());
		//to iterating rows one by one
		for (int i = 0; i < Rows.size(); i++) {
			WebElement element = Rows.get(i);
			
	  // to iterate data from rows
			
			List<WebElement> Data = element.findElements(By.tagName("td"));
			
			for (int j = 0; j < Data.size(); j++) {
				WebElement element2 = Data.get(j);
				String text = element2.getText();
				System.out.println(text);
				
			}
			
		}
		
	}

}
