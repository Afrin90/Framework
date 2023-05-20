package PageLotactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasaClass;

public class LoginPageLocator extends BasaClass{

	public LoginPageLocator () {//land owned by 'this' key word
		PageFactory.initElements(driver,this); 
			
	}	
	@FindBy (id="loginusername")
	public WebElement Username; //webElement = locator

	@FindBy (id="loginpassword")
	public WebElement Password; //webElement = locator

	@FindBy (xpath="//button[text()='Log in']")
	public WebElement LoginButton; //webElement = locator
	
}