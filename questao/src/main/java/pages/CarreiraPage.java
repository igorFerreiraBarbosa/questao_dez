package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class CarreiraPage extends BaseTest {
	
	public CarreiraPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a.button.highlight")
	WebElement btnOpenWorkOpportunities;
	
	String originalWindow = driver.getWindowHandle();
	
	public void checkForWindowFrame(String w)
	{
		for(String window: driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(window)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
	
	public String validateCarreiraPage()
	{
		return btnOpenWorkOpportunities.getText();
	}
	
	public VagasPage goToOpenOpportunities()
	{
		btnOpenWorkOpportunities.click();
		checkForWindowFrame(originalWindow);
		return new VagasPage();
	}
	
}
