package source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
ChromeDriver driver;
	
	@FindBy (id="twotabsearchtextbox")
	WebElement searchtextfield; //this is my user name
	
	@FindBy (id="nav-search-submit-text")
	WebElement searchbutton; //password text field
	
	public void search()
	{
		searchtextfield.sendKeys("shoe");
	}
	public void searching_product()
	{
		searchbutton.click();
	}
	
	public Home(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
