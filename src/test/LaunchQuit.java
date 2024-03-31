package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a2 =new Actions(driver);
		a2.moveToElement(signin).perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		TakesScreenshot ts	=driver;
	  	File source=		ts.getScreenshotAs(OutputType.FILE);
	  	File destination=new File("C:\\Users\\ayyal\\eclipse-workspace\\Amazon_POM\\Screenshots\\abhi"+Math.random()+".png");
	  	FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		driver.quit();
	}

}
