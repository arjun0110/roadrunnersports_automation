package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class LoginwithInvalidPassword extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Login with invalid password";
		testDescription="Login to an existing account with an invalid password";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC010";
	}
	@Test(dataProvider="fetchData")
	public void LoginwithInvalidPasswor(String email, String password)  {
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email)
		.clickNext()
		.enterpassword(password)
		.loginwithinvalidpassword()
		
		.errormsg();
	}
}