package com.POM.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.POM.BasePage.BasePage;

public class AdminPage extends BasePage {

	public AdminPage Admin() {

		WebElement ele1 = driver.findElementByXPath("//b[contains(text(),'Admin')]");
		WebElement ele2 = driver.findElementByXPath("//a[@id='menu_admin_UserManagement']");
		WebElement ele3 = driver.findElementByXPath("//a[@id='menu_admin_viewSystemUsers']");

		Act.moveToElement(ele1).click().build().perform();
		Act.moveToElement(ele2).click().build().perform();
		Act.moveToElement(ele3).click().build().perform();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return this;
	}

	public AddUsers Add_users() {
		driver.findElement(By.xpath("//input[@id='btnAdd']"));
		return new AddUsers();
	}

	public SearchUsers Search_Users() {
		driver.findElement(By.xpath("//*[@id='searchBtn']"));
		return new SearchUsers();
	}

}
