package com.POM.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.POM.BasePage.BasePage;

public class DashboardPage extends BasePage {

	public AdminPage DashBoard() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement AdminTab1 = driver.findElementByXPath("//*[@id='menu_admin_viewAdminModule']/b");
		Act.moveToElement(AdminTab1).click().build().perform();
		return new AdminPage();
	}

}
