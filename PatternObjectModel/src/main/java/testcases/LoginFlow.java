package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class LoginFlow extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Login flow";
		testDescription="Login to an existing account";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void Login(String email, String password)  {
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email)
		.clickNext()
		.enterpassword(password)
		.login()
		.accountcreation();
	}
}