package com.POM.TestCases;

import org.testng.annotations.Test;
import com.POM.BasePage.BasePage;
import com.POM.Pages.DashboardPage;

public class POMtestcase04 extends BasePage {

	@Test
	public void DashBoard() {
		// new BasePage().Logincheck();
		// new BasePage().Logincheck().uname(Uname).pwd(pwd).submit();
		new DashboardPage().DashBoard();
	}

}
