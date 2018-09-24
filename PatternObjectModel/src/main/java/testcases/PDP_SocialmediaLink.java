package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_SocialmediaLink  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Facebbok navigation";
		testDescription="Verify whether facebook page navigation is proper or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC021";
		
		
	}
	
	@Test
	public void facebookpage()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.socialmedialinks()
			.fbnavigation()
			.newtab();
}
}