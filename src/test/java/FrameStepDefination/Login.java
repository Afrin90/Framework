package FrameStepDefination;

import PageAction.HomePageAction;
import PageAction.LoginPageAction;
import PageAction.ProfilePageAction;
import Utility.BasaClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends BasaClass {
	HomePageAction homepageAction = new HomePageAction ();
	LoginPageAction loginPageAction = new LoginPageAction ();
	ProfilePageAction profilePageAction = new ProfilePageAction ();
	
	@Given("^open Demoblaze <\"([^\"]*)\"> Application$")
	public void open_Demoblaze_Application(String URL) throws Throwable {
		waterfallURL (URL); 
		Thread.sleep(2000);
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
		homepageAction.ClickLogin();
		Thread.sleep(2000);
	}

	@Then("^Enter Username and Password and Click Login(\\d+)$")
	public void enter_Username_and_Password_and_Click_Login(int arg1) throws Throwable {
		loginPageAction.userCard(waterfallpro.getProperty("Username"),waterfallpro.getProperty("Password"));
		Thread.sleep(2000);
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		profilePageAction.Verifyuserloginsuccessfully(); 
		Thread.sleep(2000);
		
		
}
}