package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class VagasPage extends BaseTest {
	
	public VagasPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#pesquisar-vaga-localidade-etc")
	WebElement searchField;
	
	@FindBy(tagName="small")
	WebElement architectOpportunityFound;
	
	public void searchForArchitectOpportunities()
	{
		new WebDriverWait(driver, Duration.ofSeconds(5));
		searchField.sendKeys("architect");
	}
	
	public boolean validateArchitectOpportunity()
	{
		return architectOpportunityFound.isDisplayed();
	}

}
