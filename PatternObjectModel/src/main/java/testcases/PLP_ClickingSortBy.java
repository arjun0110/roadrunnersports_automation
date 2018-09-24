package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PLP_ClickingSortBy extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking SortBy dropdown";
		testDescription="Checking the functionality of Sort by dropdown";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC013";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void sortBy(String text)  {
		
		new HomePage_RRS()
		.searchbrands()
		.rgearbrand()
		.clickSort(text);
		
		
	}
}