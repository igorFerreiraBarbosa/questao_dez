package decima.questao.testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GooglePage;

public class GooglePageTest extends BaseTest {

	GooglePage googlePage;

	public GooglePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		start();
		googlePage = new GooglePage();
	}

	@Test
	public void googleTitleTest() {
		String title = googlePage.validateGoogleTitle();
		Assert.assertEquals(title, "Google");
	}

	@Test
	public void validateFirstLinkTest() throws InterruptedException {
		googlePage.searchForNttData();
		Thread.sleep(5000);
		googlePage.clickFirstLink();
		Assert.assertTrue(true);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
