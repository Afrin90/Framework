package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class BasaClass {
	//1 method for constructor
	// will have method for browser
	// will have method for URL
	// properties class by java
	// fileinputstream by Apache POI-interface
	//fileinputstream is responsible to read a file
	//Properties class will bring all we need
	public static WebDriver driver;
	public static Properties waterfallpro;
	
	public BasaClass () {
	
		try {
			FileInputStream waterfallFile =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Configaration\\ConfiFile.Properties");
			waterfallpro = new Properties();
			waterfallpro.load(waterfallFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		 System.out.println("Please check your code");
			e.printStackTrace();
		}
		
	}
	public void waterfallBrowser () {
		String Browser= waterfallpro.getProperty("WatterFallBrowser1");	
		if (Browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.drive",(System.getProperty("user.dir")+"\\FrameDriver\\chromedriver.exe"));
			 //driver = new ChromeDriver();
			System.setProperty("webdriver.edge.drive",(System.getProperty("user.dir")+"\\ieDriver\\msedgedriver.exe"));
			 driver = new EdgeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataClass.implicitlyWait));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataClass.pageLoadTimeout));
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies(); 	
			
		}
		else if (Browser.equalsIgnoreCase("FF")); 
	}
	public static void waterfallURL (String URL) {
		driver.get(waterfallpro.getProperty("URLQA"));
		
	}
}
