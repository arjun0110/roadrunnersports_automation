package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_Chooseasize extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Choose a size for the product";
		testDescription="Verify if a size can be chosen";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void choosesize()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosesize();
			
			
	}

	}

