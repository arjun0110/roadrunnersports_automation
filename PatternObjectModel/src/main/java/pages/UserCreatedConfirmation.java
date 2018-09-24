package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UserCreatedConfirmation extends ProjectMethods{
	
	public UserCreatedConfirmation() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//div[@class='myAccount-membership-wrapper']")
	private WebElement createdsuccessfully;
	
	public UserCreatedConfirmation accountcreation()
	{
		verifyDisplayed(createdsuccessfully);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//li[@class='myacount-dropdown']")
	private WebElement myaccountmousehover;
	
	public UserCreatedConfirmation mousehover()
	{
		mouseHover(myaccountmousehover);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//ul[@class='dropdown-sub']/li[2]/a")
	private WebElement logoutlink;
	
	public HomePage_RRS logout()
	{
		click(logoutlink);
		return new HomePage_RRS();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;

	
	public Searchresults entersearch(String data)
	{


		refresh();
		FluentWait();
		
		verifyDisplayed(searchfield);
		
		type(searchfield, data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	

}