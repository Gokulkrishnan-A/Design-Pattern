package appHooks;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.google.common.util.concurrent.Uninterruptibles;

import org.testng.annotations.AfterTest;

import driverFactory.DriverFactory;
import utilitis.ConfigBrowser;

public class appHooks {

	private DriverFactory driverFac;
	private ConfigBrowser config;
	protected WebDriver driver;
	public Properties prop;

	
	@BeforeTest
	public WebDriver cofigBrowser() throws IOException {
		config = new ConfigBrowser();
		prop = config.configInit();
		String broswerName = prop.getProperty("browser");
		driverFac = new DriverFactory();
		driver = driverFac.driverInit(broswerName);
		return driver;
	}
	
	@AfterTest
	public void closeBroswer() {
		System.out.println("driver closed");
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		driver.quit();
	}

}
