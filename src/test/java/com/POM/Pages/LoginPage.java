package com.POM.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.POM.BasePage.BasePage;

public class LoginPage extends BasePage {

	// public WebDriver driver;

	public LoginPage uname(String Uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(Uname);
		return this;
	}

	public LoginPage pwd(String pwd) {
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		return this;
	}

	public DashboardPage submit() {
		//driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("btnLogin")).click();
		return new DashboardPage();
	}
}
