package designPattern.Factory.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import designPattern.Factory.common.GooglePage;

 class GoogleEnglish extends GooglePage {

	protected WebDriver driver;
	
	@FindBy(xpath = "//textarea[@type='search']")
	protected WebElement searchBox;
	
	@FindBy(name="btnK")
	protected	WebElement serachbtn;
	
	@FindBy(xpath= "//div[@class='yuRUbf']")
	protected List<WebElement> result;

	public GoogleEnglish(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@Override
	public void launchPage() {
		driver.get("https://www.google.com/");
	}

	@Override
	public void search(String Keyword) {
		searchBox.sendKeys(Keyword);
		wait.until(ExpectedConditions.visibilityOf(serachbtn));
		serachbtn.click();
	}

	@Override
	public int stat() {
		return result.size();
	}

}
