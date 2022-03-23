package com.nse.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Navigate onto https://www.goto.com/meeting/ Click on Accept Recommended
		 * Settings Click on Try Free ( if not click on Get a demo) Enter first name as
		 * “John” Enter last name as “wick” Enter work email as “john@gmail.com” Company
		 * size – 10-99 Click on signup
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ompat\\\\OneDrive\\\\Desktop\\\\Training Materials\\\\java_selenium_traning\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.xpath("//button[text() = 'Accept Recommended Settings']")).click();
		driver.findElement(By.linkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("login__password")).sendKeys("Omkar@1234");
		
		Select selectComp = new Select(driver.findElement(By.id("CompanySize")));
		selectComp.selectByVisibleText("10 - 99");
		
		
		driver.findElement(By.xpath("//button[text() = 'Start My Trial']")).click();

	}

}
