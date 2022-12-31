package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TC1 {

	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Do login description")
	public void doLogin() throws FileNotFoundException {
		Assert.fail("login test failed");
		System.out.println("do login test case passed");
	}

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("User reg description")
	public void userReg() {
		Assert.fail("User reg failed");

	}

	@Severity(SeverityLevel.CRITICAL)
	@Test
	@Description("Skip user description")
	public void isSkip() {
		System.out.println("Skipping the test case");
	throw new SkipException("Skipping as dev is not completed...!!");

	}
}
