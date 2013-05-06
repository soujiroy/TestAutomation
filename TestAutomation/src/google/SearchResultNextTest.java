package google;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchResultNextTest extends Utility {
	@Test(groups = {"google.SearchResultNextTest", "Sanity"}, timeOut = 10000)
	public void testSearchResultNextTest() {
		// Execution
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("pnnext")).click();
		} catch (Exception e) {
			assertAndLog(false);
		}
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		System.out.println("finish");
	}

}
