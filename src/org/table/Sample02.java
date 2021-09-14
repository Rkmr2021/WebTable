package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample02 {
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","G:\\Selenium_workspace\\WebTable\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/2021/08");
	// to fetch the header from table
	List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
	// to get the no. of values
	System.out.println("Total no. of Headers:" +Headers.size());
	// to iterate the header one by one
	for (int i = 0; i < Headers.size(); i++) {
		 WebElement element = Headers.get(i);
		 String text = element.getText();
		System.out.println(text);
		}
	System.out.println("***************************");
	// to fetch the row from table
	List<WebElement> Rows = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
	// to get the no. of the Rows
	System.out.println("Total no of Rows:" + Rows.size());
	for(WebElement X : Rows) {
		String text = X.getText();
		System.out.println(text);
	}
	System.out.println("######################################");
	// To fetch the data from table
	List<WebElement> Data = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
	//to get the no. of data
	System.out.println("Total no. of datas :" + Data.size());
	// To iterate the data one by one
	for (int i = 0; i < Data.size(); i++) {
		WebElement element = Data.get(i);
		String text = element.getText();
		System.out.println(text);
		}
	
	}

}
