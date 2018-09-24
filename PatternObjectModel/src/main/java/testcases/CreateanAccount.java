package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class CreateanAccount  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Create an account";
		testDescription="Verify if an account can be created or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
public void createanAccount(String keyword, String password, String confirmPassword)  {
		
		new HomePage_RRS()
		.clickmyaccount()
		.enteremail(keyword)
		.clickNext()
		.enterPassword(password)
		.confirmPassword(confirmPassword)
		.clickcreate()
		.accountcreation();
	}





}
