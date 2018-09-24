package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Productdetails extends ProjectMethods{
	
	public Productdetails() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@content,'mpn:RRL1135')]")
	private WebElement verifyproduct;
	
	
	public Productdetails verifyProduct() 
	{
		
		verifyDisplayed(verifyproduct);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_reg_price3')]")
	private WebElement msrp;
	
	public Productdetails verifymsrp() 
	{
		
		verifyDisplayed(msrp);
		highLighterMethod(driver, msrp);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_vip_price')]")
	private WebElement vip;
	
	public Productdetails verifyvip() 
	{
		
		verifyDisplayed(vip);
		highLighterMethod(driver, vip);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'get_this_price')]")
	private WebElement getthisprice;
	public Productdetails getthispricelink() 
	{
		
		verifyDisplayed(vip);
		highLighterMethod(driver, getthisprice);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@content,'mpn:RRL1135')]")
	private WebElement itemid;
	public Productdetails itemid() 
	{
		
		verifyDisplayed(itemid);
		highLighterMethod(driver, itemid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@src,'https://s7ondemand1.scene7.com/is/image/roadrunnersports/RRL1135-BK_SW')]")
	private WebElement color;
	public Productdetails choosecolor() 
	{
		highLighterMethod(driver, color);
		click(color);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'Black')]")
	private WebElement colorofsecond;
	public Productdetails choosecolorforsecondproduct() 
	{
		highLighterMethod(driver, colorofsecond);
		click(colorofsecond);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@src,'https://s7ondemand1.scene7.com/is/image/roadrunnersports/RRL1135-056_SW')]")
	private WebElement colors;
	public Productdetails chooseacolor() 
	{
		
		highLighterMethod(driver, colors);
		click(color);
		FluentWait();
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@class='head']")
	private WebElement socialmedia;
	
	public Productdetails socialmedialinks() 
	{
		scrollBottom();
		highLighterMethod(driver, socialmedia);
		verifyDisplayed(socialmedia);
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_2Tab')]")
	private WebElement reviews;
	
	public Productdetails reviewsTab() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(reviews);
		FluentWait();
		highLighterMethod(driver, reviews);
		verifyDisplayed(reviews);

		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'pdetails_suggestions_tab')]")
	private WebElement youlike;
	
	public Productdetails youmaysldolike() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(youlike);
		FluentWait();
		highLighterMethod(driver, youlike);
		verifyDisplayed(youlike);

		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_3Tab')]")
	private WebElement videos;
	
	public Productdetails videoTab() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(videos);
		FluentWait();
		highLighterMethod(driver, videos);
		verifyDisplayed(videos);

		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'grp_4Tab')]")
	private WebElement needhelp;
	
	public Productdetails needHelp() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(needhelp);
		FluentWait();
		highLighterMethod(driver, needhelp);
		verifyDisplayed(needhelp);

		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'product_desc_content')]")
	private WebElement productDescription;
	
	public Productdetails productDetails() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, productDescription);
		verifyDisplayed(productDescription);
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Find us on Facebook')]")
	private WebElement fb;
	
	public Facebook fbnavigation() 
	{
	click(fb);
		
		return new Facebook();
	}
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'XS')]")
	private WebElement size;
	public Productdetails choosesize() 
	{
		highLighterMethod(driver, size);
		click(size);
		FluentWait();
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@alt,'Size Chart')]")
	private WebElement sizechart;
	public Productdetails sizechart() 
	{
		highLighterMethod(driver, sizechart);
		verifyDisplayed(sizechart);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'quantity')]")
	private WebElement quantity;
	public Productdetails quantity() 
	{
		click(quantity);	
		highLighterMethod(driver, quantity);
		
		
		return this;
	}

	@FindBy(how=How.XPATH,using="//*[contains(@id,'addToCartButton')]")
	private WebElement addtocartbutton;
	public Productdetails addtocart() 
	{
		click(addtocartbutton);	
		
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'prod_detail_preorder_inventory')]")
	private WebElement addtocarterrormessage;
	public Productdetails addtocartIncorrectmessage() 
	{
		verifyDisplayed(addtocarterrormessage);
		
		
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@src,'/rrs/img/checkout/viewcartpop_btn.gif')]")
	private WebElement cart;
	public ViewCart viewCart() 
	{
		click(cart);
		
		
		
		return new ViewCart();
	}
	
	
	
}

