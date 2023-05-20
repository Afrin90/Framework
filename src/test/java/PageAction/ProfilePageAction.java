package PageAction;

import org.testng.Assert;

import PageLotactor.ProfilePageLocator;
import Utility.BasaClass;

public class ProfilePageAction extends BasaClass{

ProfilePageLocator profilePageLocator = new ProfilePageLocator ();

	public void Verifyuserloginsuccessfully () {
	
	boolean profilevalidation =	profilePageLocator.Profile.isDisplayed();
	Assert.assertTrue(profilevalidation);
	
}
	
}
