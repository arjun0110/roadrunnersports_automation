package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_SizechartAvailable extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Display of size chart";
		testDescription="Verify if size chart is displayed or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void sizeChart()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.sizechart();
			
			
	}

	}

