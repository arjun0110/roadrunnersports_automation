package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PLP_Showproductsperpage extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking Showproductsperpage dropdown";
		testDescription="Checking the functionality of Showproductsperpage dropdown";
		testNodes="test";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="brand";
		dataSheetName="TC0rt";
		
		
	}
	
	@Test
	public void sortBy() throws AWTException  {
		
		new HomePage_RRS()
		.searchbrands()
		.rgearbrand()
		.verifyshowperpage();
		
		
		
	}
}