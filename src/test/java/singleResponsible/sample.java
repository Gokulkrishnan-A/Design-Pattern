package singleResponsible;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appHooks.appHooks;
import designPattern.srp.main.GoogleMainPage;
import designPattern.srp.result.ResultPage;

public class sample extends appHooks {

	private GoogleMainPage mainPage;
	private ResultPage resultPage;
			
	@BeforeTest
	public void setUp() {
		this.mainPage = new GoogleMainPage(driver);
		this.resultPage = new ResultPage(driver);
	}
	
//	@Test
//	public void launchPage()
//	{
//		mainPage.goTo();
//		Assert.assertTrue(mainPage.getSearchWidget().isDisplayed());
//	}
	
	@Test(dataProvider = "getData")
	public void playWorkFlow(String Keyword, int index) throws InterruptedException
	{
		mainPage.goTo();
		Assert.assertTrue(mainPage.getSearchWidget().isDisplayed());
		mainPage.getSearchWidget().enterText(Keyword);
		Assert.assertTrue(mainPage.getSearchSuggestion().isDisplayed());
	
		mainPage.getSearchSuggestion().selectByIndex(index);
		Assert.assertTrue(resultPage.getSearchWidget().isDisplayed());	
		
		resultPage.getSearchWidget().enterText(Keyword);
		Assert.assertTrue(resultPage.getSearchSuggestion().isDisplayed());
		
		resultPage.getSearchSuggestion().selectByIndex(index);
		Assert.assertTrue(resultPage.getNavigate().isDisplayed());	
		
		resultPage.getNavigate().goToVideos();
		Assert.assertTrue(resultPage.getStat().isDisplayed());
		
		System.out.println(resultPage.getStat().getResultStat());

	}
	
	@DataProvider                
	public Object[][] getData(){
		return new Object[][] {
			    {"Python" ,3},
				{ "Selenium" ,4}
				};
	}

}
