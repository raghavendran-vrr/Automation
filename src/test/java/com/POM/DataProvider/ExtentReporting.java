package com.POM.DataProvider;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {

	// step-1 Add one more maven depandancy/
	// add depency avenstack in pom xml

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test, node;

	public String testcaseName, testcaseDec, author, category;
	public String excelfileName, excelSheetName;

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void report() throws IOException {
		test = extent.createTest(testcaseName, testcaseDec);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	@AfterSuite
	public void stopReport() {
		extent.flush();
	}

}
