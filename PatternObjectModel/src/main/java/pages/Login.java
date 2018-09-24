package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Login extends ProjectMethods{
	
	public Login() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@id='loginEmailForm-email']")
	private WebElement emailfield;
	
	public Login enteremail(String email) {
		
		type(emailfield, email);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='loginEmailFormBtn']")
	private WebElement clickNext;


	public Passwordenter clickNext() {
		
		click(clickNext);
		return new Passwordenter();
		
	}
}
