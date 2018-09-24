package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class AddtwoProductstoCart extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Second product is added to cart";
		testDescription="Verify if the user can add more than one product";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC025";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void twoproductstocart(String brand)  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.choosecolor()
			.choosesize()
			.addtocart()
			.viewCart()
			.verifycarttitle()
			.entersecondproduct(brand)
			.clickproductlinksecondtime()
			.choosecolorforsecondproduct()
			.choosesize()
			.addtocart()
			.viewCart()
			.verifycarttitle()
			.getthisprice()
			.vip();
			
			
			
			
			
	}

	}
