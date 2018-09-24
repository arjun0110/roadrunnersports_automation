package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ShopNow extends ProjectMethods{
	
	public ShopNow() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'categoryName')]")
	private WebElement categoryname;
	
	
	
	public ShopNow checkcategory()
	{
		verifyDisplayed(categoryname);
		highLighterMethod(driver,categoryname);
		
		
		return this;
	}
	
}
