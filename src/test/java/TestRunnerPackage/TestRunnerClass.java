package TestRunnerPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.BasaClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FrameFolder"},
plugin = {"json:target/cucumber.json"},
glue = "FrameStepDefination")//tags = {"@Sanity"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {
@BeforeTest
public void OpenURL () {
  BasaClass test = new BasaClass();	
  test.waterfallBrowser();
}
@AfterTest
public void CloseURL () {
	 BasaClass test = new BasaClass();
	 test.driver.quit();
}
}
 