package com.POM.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import com.POM.DataProvider.ExtentReporting;
import com.POM.Pages.DashboardPage;
import com.POM.Pages.LoginPage;

public class BasePage extends ExtentReporting {
	public static ChromeDriver driver;
	// entire project driver will be reference as we given static
	// if we dont give static we need to refer create a localised driver for every
	// class
	public Actions Act;

	/*
	 * public LoginPage Logincheck() { public void Logincheck() { // TODO
	 * Auto-generated method stub System.setProperty("webdriver.chrome.driver",
	 * "./drivers/chromedriver.exe"); driver = new ChromeDriver(); String url =
	 * "https://opensource-demo.orangehrmlive.com"; driver.get(url);
	 * driver.manage().window().maximize();
	 * 
	 * // Initializing Action class Act = new Actions(driver); //return new
	 * LoginPage(); }
	 */

	@BeforeMethod

	public void Logincheck() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Initializing Action class
		Act = new Actions(driver);
		// return new LoginPage();
	}

}
