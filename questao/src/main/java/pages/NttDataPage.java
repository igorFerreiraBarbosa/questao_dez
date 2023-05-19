package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class NttDataPage extends BaseTest {
	
	public NttDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button#all")
	WebElement allCookiesBtn;
	
	@FindBy(css="div.company")
	WebElement nttDataPage;
	
	@FindBy(xpath="//div[@class='lower']//ul//a//span[text()='Carreira']")
	WebElement carreira;
	
	public void acceptAllCookies()
	{
		allCookiesBtn.click();
	}
	
	public String validateNttDataPage() {
		
		return nttDataPage.getText();
	}
	
	public CarreiraPage goToCarreiraPage()
	{
		acceptAllCookies();
		new WebDriverWait(driver, Duration.ofSeconds(5));
		carreira.click();
		return new CarreiraPage();
	}

}
