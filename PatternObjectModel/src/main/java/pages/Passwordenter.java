package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Passwordenter extends ProjectMethods{
	
	public Passwordenter() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@id='loginEmailPasswordForm-password']")
	private WebElement passwordfield;
	
	public Passwordenter enterpassword(String password) {
		
		type(passwordfield, password);
		return this;
		
	}
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='loginEmailPasswordFormBtn']")
	private WebElement Login;
	
public UserCreatedConfirmation login() {
		
		click(Login);
		return new UserCreatedConfirmation();
		
	}
	
public Passwordenter loginwithinvalidpassword() {
	
	click(Login);
	return this;
	
	
}

@FindBy(how=How.XPATH,using="//input[@id='loginEmailPasswordFormBtn']")
private WebElement signin;

public Passwordenter signinvisibility() {
	
	
	return this;
	
	
}

@FindBy(how=How.XPATH,using="//div[@id='mobile-login-wrapper']/div/div/div")
private WebElement invaliderrormsg;

public Passwordenter errormsg() {
	
	FluentWait();
verifyDisplayed(invaliderrormsg);
	return this;
	
}




}