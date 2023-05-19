package decima.questao.testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CarreiraPage;
import pages.GooglePage;
import pages.NttDataPage;
import pages.VagasPage;

public class VagasPageTest extends BaseTest {
	
	private GooglePage googlePage;
	private NttDataPage nttDataPage;
	private CarreiraPage carreiraPage;
	private VagasPage vagasPage;

	@BeforeMethod
	public void setUp()
	{
		start();
		googlePage = new GooglePage();
		nttDataPage = new NttDataPage();
		carreiraPage = new CarreiraPage();
		vagasPage = new VagasPage();
	}
	
	@Test
	public void validateSearchForArchitectOpportunty()
	{
		googlePage.searchForNttData();
		googlePage.clickFirstLink();
		nttDataPage.goToCarreiraPage();
		carreiraPage.goToOpenOpportunities();
		vagasPage.searchForArchitectOpportunities();
		Assert.assertTrue(vagasPage.validateArchitectOpportunity());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
