package com.nse.seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ompat\\OneDrive\\Desktop\\Training Materials\\java_selenium_traning\\chromedriver.exe");
		
		//Create object for ChromeDriver
		ChromeDriver driver = new ChromeDriver(); //Browser is launched

		driver.get("https://www.selenium.dev/"); //Navigate to the URL
		
		String title = driver.getTitle(); //Will fetch the tile of web page
		System.out.println(title); 
		
		String currentURL = driver.getCurrentUrl(); //Will fetch the URL of web page
		System.out.println(currentURL); 
		
		driver.quit();
	}

}
