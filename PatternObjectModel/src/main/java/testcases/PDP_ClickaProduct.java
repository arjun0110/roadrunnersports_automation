package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_ClickaProduct extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking a product";
		testDescription="Verifying the product link navigation";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC019";
		
		
	}
	
	@Test
	public void clickaProduct()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.verifyProduct();
			
			
	}

	}