package PageLotactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasaClass;

public class ProfilePageLocator extends BasaClass{

	public ProfilePageLocator () {//land owned by 'this' key word
		PageFactory.initElements(driver,this); 
	
}
	@FindBy (id="nameofuser")
	public WebElement Profile; //webElement = locator

}
