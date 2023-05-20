package PageAction;

import PageLotactor.HomePageLocator;
import Utility.BasaClass;

public class HomePageAction extends BasaClass  {

	HomePageLocator homePageLocator = new HomePageLocator ();
	
 public void ClickLogin () {
	 
	 homePageLocator.LoginLink.click(); 
	 
 }
 
 
 
}
