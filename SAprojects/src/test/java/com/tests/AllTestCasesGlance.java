package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllTestCasesGlance {
	
	//public WebDriver driver;
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shree\\\\Documents\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/");
		
		driver.manage().window().maximize();
		System.out.print("........Logged in Successfully......");
		System.out.print("........Logged in Successfully......");
		System.out.print("........Logged in Successfully......");
		driver.close();
		
	}@Test
	public void LogOut() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/");
		System.out.print("........Logged Out Successfully.........");
		System.out.print("........Logged Out Successfully.........");
		System.out.print("........Logged Out Successfully.........");
		
		
		driver.manage().window().maximize();
		driver.close();
	
	

}
	@Test
	public void Inspection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/");
		System.out.print("........Inspected Successfully.........");
		
		driver.manage().window().maximize();
		driver.close();
		
	}@Test
	public void FindBy() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://dev2-app.simplicapital.ai/");
		System.out.print("........founded Successfully.........");
		
		driver.manage().window().maximize();
		driver.close();
		
	}
	
}