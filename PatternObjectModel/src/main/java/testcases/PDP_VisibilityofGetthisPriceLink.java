package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_VisibilityofGetthisPriceLink  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Visibility of get this link";
		testDescription="Verifying the visibility of get this link";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void getthisPrice()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.getthispricelink();
			
			
	}

	}