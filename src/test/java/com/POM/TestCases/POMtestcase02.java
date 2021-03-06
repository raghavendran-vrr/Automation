package com.POM.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.POM.BasePage.BasePage;
import com.POM.Pages.LoginPage;

public class POMtestcase02 extends BasePage {

	@Test(dataProvider = "DataDriver1")
	public void LoginFramework(String Uname, String pwd) {
		// new BasePage().Logincheck();
		// new BasePage().Logincheck().uname(Uname).pwd(pwd).submit();
		new LoginPage().uname(Uname).pwd(pwd).submit();
	}

	@DataProvider(name = "DataDriver1")
	public String[][] getData() throws IOException {

		return com.POM.DataProvider.TestNGDataFile.readxl(excelfileName, excelSheetName);
	}


}
