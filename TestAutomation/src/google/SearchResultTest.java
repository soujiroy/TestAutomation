package google;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchResultTest extends Utility {
	@Test(groups = {"google.SearchResultTest", "Sanity"}, timeOut = 10000)
	@Parameters(value = { "keyword" })
	public void testSearchResultTest(@Optional("google") String keyword) {
		// Execution
		try {
			Thread.sleep(2000);
			System.out.println(keyword);
			driver.findElement(By.id("resultStats"));
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
