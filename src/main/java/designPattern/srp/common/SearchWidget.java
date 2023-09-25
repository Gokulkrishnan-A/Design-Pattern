package designPattern.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchWidget extends AbstractClass {

	// private WebDriver driver;

	@FindBy(xpath = "//textarea[@type='search']")
	WebElement searchBox;

	public SearchWidget(WebDriver driver) {
		super(driver);
		// this.driver = driver;

	}

	public void enterText(String KeyWord) {
		searchBox.clear();
		searchBox.sendKeys(KeyWord);
	}

	@Override
	public boolean isDisplayed() {
		return wait.until((d) -> searchBox.isDisplayed());
	//	return wait.until(ExpectedConditions.visibilityOf(searchBox)) != null;
	}

}
