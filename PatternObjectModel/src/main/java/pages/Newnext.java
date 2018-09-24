package pages;


import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Newnext extends ProjectMethods{
	
	public Newnext() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@type, 'number') and contains(@value ,'2')]")
	private WebElement nextvalue;
	
	public Newnext verifynextvalue()
	{
		
		verifyDisplayed(nextvalue);
		highLighterMethod(driver, nextvalue);
		return this;
	}
	
	
}
	
