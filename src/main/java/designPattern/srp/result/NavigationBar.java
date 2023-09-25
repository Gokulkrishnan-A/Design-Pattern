package designPattern.srp.result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import designPattern.srp.common.AbstractClass;

public class NavigationBar extends AbstractClass {

	public NavigationBar(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='IUOThf']")
	WebElement navigation;

	@FindBy(linkText = "Images")
	WebElement images;
	// div[@class='GKS7s']//span[contains(text(),'Images')]

	@FindBy(linkText = "Videos")
	WebElement videos;

	public void goToImages() {
		images.click();
	}

	public void goToVideos() {
		videos.click();
	}

	@Override
	public boolean isDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(navigation)) != null;
	}

}
