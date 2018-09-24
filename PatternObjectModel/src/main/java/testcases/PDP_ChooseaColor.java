package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_ChooseaColor extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Choose a color for the product";
		testDescription="Verify if a color can be chosen";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void choosecolor()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosecolor();
			
			
	}

	}
