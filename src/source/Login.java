package source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	ChromeDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	public void un()
	{
		username.sendKeys("8688474688");
		continue_button.click();
	}
	public void pwd()
	{
		                                                                                         password.sendKeys("Abhilash@143");
		signinbutton.click();
	}
	public Login(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
