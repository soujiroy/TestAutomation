package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class TestUtilities {
	protected static WebDriver driver;
	protected static Boolean log = false;
	
	protected static WebDriver createDriver(String browser){
		WebDriver driver;
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("googlechrome")){
			driver = new ChromeDriver();
		}else if(browser.equals("Safari")){
			driver = new SafariDriver();
		}else{
			driver = new SafariDriver();
		}
		return driver;
	}
	
	protected static void setConfigValues() {
		
	}
	
	protected static void collectLog(){
		  if(!log){
			  System.out.println("Collect log");
			  log = false;
		  }
	}
	
	protected static void logging(String str){
		Reporter.log(str);
	}
	
	protected void assertAndLog(Boolean bool) {
		if(bool){
			Assert.assertTrue(true);			
		}else{
			log = true;
			Assert.assertTrue(false);
		}
	}
}
