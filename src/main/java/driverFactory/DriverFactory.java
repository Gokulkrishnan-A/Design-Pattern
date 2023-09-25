package driverFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
	public static WebDriver driver;
	 
	public WebDriver driverInit(String browsername) {
		
		System.out.println("Broswer initialized is "+ browsername);
		if(browsername.equalsIgnoreCase("chrome"))
		{
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--remote-allow-origins=*");
			
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			op.setBrowserVersion("114");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	return getDriver();
	}
	public static  WebDriver getDriver() {
		return driver;
}
}
