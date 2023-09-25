package designPattern.Factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


 class GoogleFrench extends GoogleEnglish {

	@FindBy(xpath = "//a[contains(text(),'Français')]")
	WebElement goToFrench;

	public GoogleFrench(WebDriver driver) {
		super(driver);

	}

	@Override
	public void launchPage() {
		driver.get("https://www.google.fr/");
		goToFrench.click();
	}



}

