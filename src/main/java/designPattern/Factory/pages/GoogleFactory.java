package designPattern.Factory.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.google.common.base.Function;

import designPattern.Factory.common.GooglePage;

public class GoogleFactory {

	//instead of using if else again and again,we are using Lamda expression Funtion of execute.
	private static final Function<WebDriver, GooglePage> ENG = (d) -> new GoogleEnglish(d);
	private static final Function<WebDriver, GooglePage> FR = (d) -> new GoogleFrench(d);
	private static final Function<WebDriver, GooglePage> SA = (d) -> new GoogleArabic(d);

	private static final Map<String, Function<WebDriver, GooglePage>> MAP = new HashMap<>();

	static {
		MAP.put("ENG", ENG);
		MAP.put("FR", FR);
		MAP.put("SA", SA);
	}

	public static GooglePage getLangauge(String language, WebDriver driver) {
		
		return MAP.get(language).apply(driver);
		
		
/*		if (language.equalsIgnoreCase("ENG")) {
			return new googleEnglish(driver);
		} else if (language.equalsIgnoreCase("FR")) {
			return new googleFrench(driver);
		} else if (language.equalsIgnoreCase("SA")) {
			return new googleArabic(driver);
		} 
	 return null;
	 
*/
	}
}
