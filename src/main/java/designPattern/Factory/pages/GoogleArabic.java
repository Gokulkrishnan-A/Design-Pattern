package designPattern.Factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

 class GoogleArabic extends GoogleEnglish {

	@FindBy(xpath = "//a[contains(text(),'العربية')]")
	WebElement goToArabic;
	
	@FindBy(xpath ="//span[@class='ly0Ckb']")
	WebElement keyBoardBtn;
	
	@FindBy(id="kbd")
	WebElement keyBoard;
	
	public GoogleArabic(WebDriver driver) {
		super(driver);
	
	}
	
	@Override
	public void launchPage() {
		this.driver.get("https://www.google.com.sa/");
		goToArabic.click();
		
	}
	
	@Override
	public void search(String Keyword) {
		wait.until(ExpectedConditions.visibilityOf(keyBoardBtn));
		keyBoardBtn.click();
		wait.until(ExpectedConditions.visibilityOf(keyBoard));
		super.search(Keyword);
	}
	
	
	

}
