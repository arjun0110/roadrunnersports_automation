package testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class SearchaModel extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="Search a model name";
		testDescription="Verify if model is present or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void seachaBrand(String xpath,String modelname) throws AWTException {
		
		new HomePage_RRS()
		.entersearchkey(xpath,modelname)
		.verifymodelname();
	}





}

