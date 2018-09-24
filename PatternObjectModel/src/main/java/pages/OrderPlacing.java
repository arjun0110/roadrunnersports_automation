package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OrderPlacing extends ProjectMethods{
	
	public OrderPlacing() {		
		PageFactory.initElements(driver,this);
	
}
	
	@FindBy(how=How.XPATH,using="//*[@id='clickButton' and @value='PLACE YOUR ORDER']")
	private WebElement placeOrder;
		
	
	
	public verifyOrder placeorderButton() {
		
	click(placeOrder);
		return new verifyOrder();
	}
}