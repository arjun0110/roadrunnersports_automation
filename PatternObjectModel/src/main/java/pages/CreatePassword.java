package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreatePassword extends ProjectMethods{
	
	public CreatePassword() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@id='loginCreateWebForm-password']")
	private WebElement enterpassword;
	
	public CreatePassword enterPassword(String password)
	{
		type(enterpassword,password);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='loginCreateWebForm-cpassword']")
	private WebElement confirmPassword;
	
	public CreatePassword confirmPassword(String password)
	{
		type(confirmPassword,password);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='loginCreateWebFormBtn']")
	private WebElement clickcreate;
	
	
	public UserCreatedConfirmation clickcreate()
	{
	click(clickcreate);
		return new UserCreatedConfirmation();
	}
	
	
			

}