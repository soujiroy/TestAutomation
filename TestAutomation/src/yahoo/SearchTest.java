package yahoo;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchTest extends Utility {
	@Test(groups = {"yahoo.SearchTest", "Sanity"})
	@Parameters(value = { "keyword" })
	public void testSearchTest(@Optional("yahoo") String keyword) {
		// Execution
		driver.findElement(By.id("srchtxt")).clear();
		driver.findElement(By.id("srchtxt")).sendKeys(keyword);
		driver.findElement(By.id("srchtxt")).submit();
	}

	@BeforeTest
	public void beforeTest() {
		try {
			driver.findElement(By.id("srchtxt"));
		} catch (Exception e) {
			driver.get("http://www.yahoo.co.jp/");
		}
	}

	@AfterTest
	public void afterTest() {
		System.out.println("finish");
	}

}
