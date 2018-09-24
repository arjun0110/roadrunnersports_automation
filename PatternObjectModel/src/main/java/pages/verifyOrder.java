package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class verifyOrder extends ProjectMethods{
	
	public verifyOrder() {		
		PageFactory.initElements(driver,this);
	
}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'order-number-total-wrap')]")
	private WebElement verifyOrderConfirmation;
		
	
	
	public verifyOrder orderConfirmationmessage() {
		
	verifyDisplayed(verifyOrderConfirmation);
	highLighterMethod(driver, verifyOrderConfirmation);
		return this;
	}
}



