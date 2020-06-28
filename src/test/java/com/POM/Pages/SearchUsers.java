package com.POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.POM.BasePage.BasePage;

public class SearchUsers extends BasePage {

	public SearchUsers uname() {
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']"));
		return this;
	}

	public SearchUsers urole() {
		WebElement usrroles = driver.findElementByXPath("//*[@id='searchSystemUser_userType']");
		Select roles = new Select(usrroles);
		roles.selectByIndex(0);
		return this;
	}

	public SearchUsers ename() {
		driver.findElement(By.xpath("//*[@id='searchSystemUser_employeeName_empName']")).sendKeys("Hannah Flores");
		return this;
	}

	public SearchUsers status() {
		WebElement statuss = driver.findElementByXPath("//*[@id='searchSystemUser_status']");
		Select roles = new Select(statuss);
		roles.selectByIndex(0);
		return this;
	}

	public SearchUsers Search_click() {
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		return this;
	}

}
