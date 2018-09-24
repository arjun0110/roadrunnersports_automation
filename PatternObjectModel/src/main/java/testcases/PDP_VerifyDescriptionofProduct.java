package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_VerifyDescriptionofProduct extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Product description";
		testDescription="Verify whether product description is present or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC022";
		
		
	}
	
	@Test
	public void productDescription()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.productDetails();
}
}