package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.AWTException;
import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class PDP_YouMayAlsoLikeTab  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="You may also like tab";
		testDescription="Verify whether you may also like are present or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC024";
		
		
	}
	
	@Test
	public void youmayLike()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			.clickproductlink()
			.youmaysldolike();
}
}
