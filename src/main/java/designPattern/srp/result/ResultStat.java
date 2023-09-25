package designPattern.srp.result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import designPattern.srp.common.AbstractClass;

public class ResultStat extends AbstractClass {

	@FindBy(id = "result-stats")
	WebElement result;

	public ResultStat(WebDriver driver) {
		super(driver);

	}

	public String getResultStat() {

		return result.getText();

	}

	@Override
	public boolean isDisplayed() {
		
		return wait.until(ExpectedConditions.visibilityOf(result)) != null;
	}

}
