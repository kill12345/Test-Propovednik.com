package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	static String propertiesFilePath = "./resources/main.properties";
	static Properties property = new Properties();
	
	private static void loadProperties() {
		try {
			FileInputStream objFile = new FileInputStream(propertiesFilePath);
			property.load(objFile);

		} catch (IOException e) {

		}
	}

	     /**
	        * Reads property value from default properties file.
	        * @param propertyName
	        * @return
	     */
	public static String getProperty(String propertyName){
		loadProperties();
		return property.getProperty(propertyName);
	}
	
}