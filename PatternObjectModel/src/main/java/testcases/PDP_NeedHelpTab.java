package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.AWTException;
import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_NeedHelpTab extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Need Help tab";
		testDescription="Verify whether NeedHelp are present or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC022";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void videos(String brandname)  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.needHelp();
}
}
