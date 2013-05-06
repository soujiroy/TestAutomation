package google;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchTest extends Utility {
	@Test(groups = {"google.SearchTest", "Sanity"}, timeOut = 10000)
	@Parameters(value = { "keyword" })
	public void testSearchTest(@Optional("google") String keyword) {
		// Execution
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys(keyword);
	}

	@BeforeTest
	public void beforeTest() {
		try {
			driver.findElement(By.id("gbqfq"));
		} catch (Exception e) {
			driver.get("http://www.google.co.jp/");
		}
	}

	@AfterTest
	public void afterTest() {
		System.out.println("finish");
	}

}
