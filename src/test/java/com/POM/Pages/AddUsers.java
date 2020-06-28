package com.POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.POM.BasePage.BasePage;

public class AddUsers extends BasePage {

	public AddUsers userrole() {

		WebElement usrrole = driver.findElementByXPath("//*[@id='systemUser_userType']");
		Select roles = new Select(usrrole);
		roles.selectByIndex(0);
		return this;
	}

	public AddUsers employeename() {
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Hannah Flores");
		return this;
	}

	public AddUsers username() {
		driver.findElement(By.id("systemUser_userName")).sendKeys("Raghavendran");
		return this;
	}

	public AddUsers status() {
		WebElement status = driver.findElementByXPath("//*[@id='systemUser_userType']");
		Select roles = new Select(status);
		roles.selectByIndex(0);
		return this;
	}

	public AddUsers password() {
		driver.findElement(By.id("systemUser_password")).sendKeys("Welcome@123456");
		return this;
	}

	public AddUsers cfrmpwd() {
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Welcome@123456");
		return this;
	}

	public AdminPage Save() {
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Welcome@123456");
		return new AdminPage();
	}

}
