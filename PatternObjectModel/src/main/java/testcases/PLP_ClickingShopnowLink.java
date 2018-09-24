package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PLP_ClickingShopnowLink extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Clicking Shop now link";
		testDescription="Checking the redirection of shop now link";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		
		
	}
	
	@Test
	public void ClickShopNow()  {
		
		new HomePage_RRS()
		.clickshopNow();
		

}
}