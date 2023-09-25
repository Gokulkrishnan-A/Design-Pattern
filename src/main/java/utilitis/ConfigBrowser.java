package utilitis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigBrowser {

	private Properties prop;
	
	public Properties configInit() throws IOException {
		
		prop=new Properties();
		FileInputStream files=new FileInputStream
				(".\\src\\test\\java\\config\\browser.properties");
		prop.load(files);
	return prop;
	}
}
