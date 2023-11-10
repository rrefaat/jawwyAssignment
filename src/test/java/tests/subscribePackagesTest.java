package tests;

import org.testng.annotations.*;

import pages.subscribePage;

public class subscribePackagesTest extends TestBase {

	subscribePage subscribeObj;

	@Test
	public void test_ckeckUAEPackages() {

		subscribeObj = new subscribePage(driver);
		subscribeObj.checkUAEPackages();
	}
	
	
	@Test
	public void test_ckeckLebanonPackages() {

		subscribeObj = new subscribePage(driver);
		subscribeObj.checkLebanonPackages();
	}
	
	@Test
	public void test_ckeckMoroccoPackages() {

		subscribeObj = new subscribePage(driver);
		subscribeObj.checkMoroccoPackages();
	}

}
