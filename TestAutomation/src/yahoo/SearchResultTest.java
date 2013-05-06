package yahoo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchResultTest extends Utility {
	@Test(groups = {"yahoo.SearchResultTest", "Sanity"})
	public void testSearchResultTest() {
		// Execution
		try {
			driver.findElement(By.className("resultNum"));
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
