package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyAccounts  extends ProjectMethods{
	
	public MyAccounts() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@id='loginEmailForm-email']")
	private WebElement emailfield;
	
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);

public MyAccounts enteremail(String email) {
	
	type(emailfield, randomInt+email);
	return this;
	
}

@FindBy(how=How.XPATH,using="//input[@id='loginEmailFormBtn']")
private WebElement clickNext;


public CreatePassword clickNext() {
	
	click(clickNext);
	return new CreatePassword();
	
}

}