package google;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import common.TestUtilities;

public class Utility extends TestUtilities {
  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
	  driver = createDriver("firefox");
	  driver.get("http://www.google.co.jp/");
  }

  @AfterSuite(alwaysRun = true)
  public void afterSuite() {
	  driver.close();
	  driver.quit();
	  collectLog();
  }

}
