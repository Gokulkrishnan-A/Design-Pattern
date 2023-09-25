package designPattern.srp.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractClass {

	protected WebDriverWait wait;

	@FindBy(xpath = "//textarea[@type='search']")
	protected WebElement searchBox;
	
	@FindBy(name="btnK")
	protected	WebElement serachbtn;
	
	@FindBy(id = "result-stats")
	protected WebElement result;
	
	public AbstractClass(WebDriver driver)
	{
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}
	
	public abstract boolean isDisplayed();
	}
