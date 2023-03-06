package stepDefination;

import java.io.FileNotFoundException;

import com.qa.util.TestContextSetUp;

import io.cucumber.java.After;

public class ApplicationHooks {
	
	TestContextSetUp textContextSetup;
	
	public ApplicationHooks(TestContextSetUp textContextSetup)
	{
		this.textContextSetup=textContextSetup;
	}
	
	@After
	public void quitBrowser() throws FileNotFoundException { 
		textContextSetup.testbase.WebDriverManager().close();
	}
	
}
