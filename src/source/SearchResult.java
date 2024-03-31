package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {
ChromeDriver driver;
	
	@FindBy (xpath="(//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20'])[1]")
	WebElement clickonfirstshoe; 
	
	@FindBy()
	WebElement childwindow;
	
	
	public void clickonfirstshoe()
	{
		clickonfirstshoe.click();
	}
	public void childwindow() throws InterruptedException
	{
		Thread.sleep(5000);
		Set<String> parchildid=driver.getWindowHandles();
		System.out.println(parchildid);
		Iterator<String> pandc=parchildid.iterator();
		String parent=pandc.next();
		String childwindow=pandc.next();
		driver.switchTo().window(childwindow);
	}
	
	public SearchResult(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
