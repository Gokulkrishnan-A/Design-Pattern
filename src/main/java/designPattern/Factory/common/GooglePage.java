package designPattern.Factory.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GooglePage {

	protected WebDriverWait wait;

	public abstract void launchPage();

	public abstract void search(String Keyword);

	public abstract int stat();


	public GooglePage(WebDriver driver) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		PageFactory.initElements(driver, this);
	}

}
