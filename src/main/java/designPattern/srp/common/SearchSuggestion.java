package designPattern.srp.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchSuggestion extends AbstractClass {


	@FindBy(css = ".sbct")
	private List<WebElement> searchResults;

	private By searchResultsBy = By.cssSelector(".sbct");

	public SearchSuggestion(WebDriver driver) {
		super(driver);
	}

	public void selectByIndex(int index) {
		searchResults.get(index - 1).click();
	}

	@Override
	public boolean isDisplayed() {
		return wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(searchResultsBy, 5)) != null;
	}
}
