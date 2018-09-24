package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PLP_EditingPageNumber extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Editing page number";
		testDescription="Checking the functionality of editing page number";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC018";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void EditingPageNumber(String value)  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.edit(value);
			
			
		
		
	}
}