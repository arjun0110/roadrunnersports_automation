package pages;

import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Facebook extends ProjectMethods{
	
	public Facebook() {		
		PageFactory.initElements(driver,this);
	}	
	
	public Facebook newtab() {
		
		newTab();
		return this;
	}
	
}