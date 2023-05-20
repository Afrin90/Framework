package PageLotactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasaClass;

public class HomePageLocator extends BasaClass{

	public HomePageLocator () {//land owned by 'this' key word
		PageFactory.initElements(driver,this); 
			
	}

@FindBy (id="login2")
public WebElement LoginLink; //webElement = locator

}
