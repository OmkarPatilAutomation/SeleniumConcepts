package com.nse.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Navigate onto https://opensource-demo.orangehrmlive.com/ Enter Username as
		 * Admin Enter Password as admin123 Click on Login Print the url Click on
		 * Welcome Click on Logout
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ompat\\\\OneDrive\\\\Desktop\\\\Training Materials\\\\java_selenium_traning\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("URL after Login:-  " + driver.getCurrentUrl());
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[9]/ul[1]/li[3]/a[1]"));
		driver.quit();

	}

}
