package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_ChooseColorandtheVariantChanges extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Choose a color for the product";
		testDescription="Verify when a color is chosen, the variant changes";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void chooseacolor()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.chooseacolor();
			
			
	}

	}