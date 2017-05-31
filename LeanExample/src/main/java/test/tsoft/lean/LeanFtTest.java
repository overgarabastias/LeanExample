package test.tsoft.lean;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Test
	public void test() throws GeneralLeanFtException {
		Browser browser = BrowserFactory.launch(BrowserType.INTERNET_EXPLORER);
		browser.navigate("www.falabella.cl");
	}

}
 