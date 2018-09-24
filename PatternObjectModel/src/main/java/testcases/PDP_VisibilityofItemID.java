package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_VisibilityofItemID extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Visibility of item ID link";
		testDescription="Verifying the visibility of item ID link";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void visibilityofItemID()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.itemid();
			
			
	}

	}