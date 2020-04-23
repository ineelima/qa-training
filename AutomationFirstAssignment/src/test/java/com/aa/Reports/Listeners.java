package com.aa.Reports;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@Test
public class Listeners extends TestListenerAdapter {
	public static ExtentHtmlReporter report;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public void onStart(ITestContext testContext) {
		report = new ExtentHtmlReporter("./Reports/learn_report_testng.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
		logger = extent.createTest("TestNG");
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}

	public void onTestSuccess(ITestResult tr) {
		logger.pass(MarkupHelper.createLabel(tr.getName() + "TestCase Passed", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult tr) {
		logger.fail(MarkupHelper.createLabel(tr.getName() + "TestCase Failed", ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult tr) {
		logger.skip(MarkupHelper.createLabel(tr.getName() + "TestCase Skipped", ExtentColor.YELLOW));
	}
}
