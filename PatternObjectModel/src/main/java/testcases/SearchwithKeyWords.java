package testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class SearchwithKeyWords extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="Search with a keyword";
		testDescription="Verify if keyword is present or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void seachaBrand(String xpath,String keyword) throws AWTException {
		
		new HomePage_RRS()
		.entersearchkey(xpath,keyword)
		.verifykeyword();
	}





}
