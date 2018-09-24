package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

import pages.HomePage_RRS;


public class LaunchTheUrl extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Launching the roadrunner site";
		testDescription="Verify if search button is present";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test
	public void verifysearch() {
		
		new HomePage_RRS()
		.verifysearchbutton();		
	}



}
