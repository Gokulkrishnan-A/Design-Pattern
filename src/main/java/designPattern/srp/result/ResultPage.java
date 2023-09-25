package designPattern.srp.result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import designPattern.srp.common.SearchSuggestion;
import designPattern.srp.common.SearchWidget;

public class ResultPage {

	private NavigationBar navigate;
	private SearchSuggestion searchSuggest;
	private SearchWidget searchWidget;
	private ResultStat stat;

	public ResultPage(WebDriver driver) {
		this.navigate = PageFactory.initElements(driver, NavigationBar.class);
		this.searchSuggest = PageFactory.initElements(driver, SearchSuggestion.class);
		this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
		this.stat = PageFactory.initElements(driver, ResultStat.class);
	}

	public NavigationBar getNavigate() {
		return navigate;
	}

	public SearchWidget getSearchWidget() {
		return searchWidget;
	}

	public SearchSuggestion getSearchSuggestion() {
		return searchSuggest;
	}

	public ResultStat getStat() {
		return stat;
	}
}
