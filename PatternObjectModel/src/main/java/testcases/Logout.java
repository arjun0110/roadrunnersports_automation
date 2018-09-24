package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Logout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Logout";
		testDescription="Logout an user";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC011";
	}
	
	@Test(dataProvider="fetchData")
	public void Loggingout(String email, String password)  {
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email)
		.clickNext()
		.enterpassword(password)
		.login()
		.accountcreation()
		.mousehover()
		.logout()
		.verifysearchbutton();
		
	}
	}