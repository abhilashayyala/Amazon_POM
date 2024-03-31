package test;

import org.testng.annotations.Test;

import source.Home;
import source.Login;
import source.SearchResult;
//login>>search>>add to cart>>cod payment

public class AMZ_ST_01 extends LaunchQuit{
	
	@Test
	public void testcase1() throws InterruptedException
	{
		Login l1=new Login(driver);
		l1.un();
		l1.pwd();
		Home h1=new Home(driver);
		h1.search();
		h1.searching_product();
		SearchResult s1=new SearchResult(driver);
		s1.clickonfirstshoe();
		s1.childwindow();	
	}

}
