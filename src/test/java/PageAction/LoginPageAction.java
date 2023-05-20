package PageAction;

import PageLotactor.LoginPageLocator;
import Utility.BasaClass;

public class LoginPageAction extends BasaClass {

	LoginPageLocator loginPageLocator = new LoginPageLocator ();
	
	public void userCard (String u, String p) {
		loginPageLocator.Username.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
	}
}
