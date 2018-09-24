package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.AWTException;


import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_VideosTab extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Videos tab";
		testDescription="Verify whether Videos are present or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC022";
		
		
	}
	
	@Test
	public void videos()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.videoTab();
}
}
