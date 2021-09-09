package stepDefinations;

import Cucumber.Automation.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends base {
	
	@Before("@MobileTest")
	public void beforeValidatio()
	{
		//System.out.println("Steps Executed");
	}

	@After("@MobileTest")
	public void afterValidatio()
	{
		System.out.println("Steps Execution Over");
	}
	
	@After("@seleniumTest")
	public void afterSeleniumTest()
	{
		driver.close();
	}


	
}
