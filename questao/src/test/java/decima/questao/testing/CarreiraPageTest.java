package decima.questao.testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CarreiraPage;
import pages.GooglePage;
import pages.NttDataPage;

public class CarreiraPageTest extends BaseTest {
	
	private GooglePage googlePage;
	private NttDataPage nttDataPage;
	private CarreiraPage carreiraPage;

	CarreiraPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		start();
		googlePage = new GooglePage();
		nttDataPage = new NttDataPage();
		carreiraPage = new CarreiraPage();
	}
	
	@Test
	public void validateCarreiraPageTest() {
		googlePage.searchForNttData();
		googlePage.clickFirstLink();
		nttDataPage.goToCarreiraPage();
		String btnCarreiraPage = carreiraPage.validateCarreiraPage();
		Assert.assertEquals(btnCarreiraPage, "BUSCAR VAGAS ABERTAS");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
