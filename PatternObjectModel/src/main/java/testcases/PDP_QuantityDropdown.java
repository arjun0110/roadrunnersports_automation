package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_QuantityDropdown extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Display of units in quantity dropdown";
		testDescription="Verify if quantity dropdown can be clicked";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void quantitydropdown(){
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.quantity();
			
			
	}

	}


