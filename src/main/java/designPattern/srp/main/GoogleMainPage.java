package designPattern.srp.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import designPattern.srp.common.SearchSuggestion;
import designPattern.srp.common.SearchWidget;

public class GoogleMainPage {

	private WebDriver driver;
	private SearchSuggestion searchSuggest;
	private SearchWidget searchWidget;

	public GoogleMainPage(WebDriver driver) {
		this.driver = driver;
		this.searchSuggest = PageFactory.initElements(driver, SearchSuggestion.class);
		this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
	}

	public void goTo() {
		driver.get("https://www.google.com/");
	}

	public SearchWidget getSearchWidget() {
		return searchWidget;
	}

	public SearchSuggestion getSearchSuggestion() {
		return searchSuggest;
	}
}
