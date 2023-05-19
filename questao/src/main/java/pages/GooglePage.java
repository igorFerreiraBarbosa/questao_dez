package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class GooglePage extends BaseTest {
	
	public GooglePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form[@action='/search']//textarea")
	public WebElement googleSearchField;
	
	@FindBy(xpath="//div[@data-text-ad='1']//a")
	public WebElement googleFirstLink;
	
	public String validateGoogleTitle()
	{
		return driver.getTitle();
	}
	
	public void searchForNttData()
	{
		googleSearchField.sendKeys("nttdata" + Keys.ENTER);
	}
	
	public void clickFirstLink() 
	{
		googleFirstLink.click();
	}

}
