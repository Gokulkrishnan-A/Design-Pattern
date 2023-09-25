package factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appHooks.appHooks;
import designPattern.Factory.common.GooglePage;
import designPattern.Factory.pages.GoogleFactory;

public class GoogleSearchTest extends appHooks{
	
	private GooglePage googlePage;
	
	@Test(dataProvider ="getData")
	public void searchTest(String keyword, String Langauge) {
		
		googlePage= GoogleFactory.getLangauge(Langauge, driver);
		googlePage.launchPage();
		googlePage.search(keyword);
		System.out.println("Result count " + googlePage.stat());
		
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][]{
			{"Selenium" , "ENG"},
			{ "Java"  ,"FR"},
			{ "Python" , "SA"}
		    };
	}

	
}
