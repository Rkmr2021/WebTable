package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium_workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2021/08");
		WebElement Table = driver.findElement(By.id("customers"));
		List<WebElement> Headers = Table.findElements(By.id("th"));
		for (int i = 0; i < Headers.size(); i++) {
			WebElement element = Headers.get(i);
			String text = element.getText();
			System.out.println(text);
			
		}
		
	}

}
