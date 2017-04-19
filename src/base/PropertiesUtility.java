package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public static void main(String[] args) {

		String Go = "C:/Users/Stepa/Workspace/WebDriverProject/src1/property.file";
		FileInputStream fileInputStream;

		// инициализируем �?пециальный объект Properties
		// типа Hashtable дл�? удобной работы �? данными

		Properties prop = new Properties();

		try {
			// обращаем�?�? к файлу и получаем данные
			fileInputStream = new FileInputStream(Go);
			prop.load(fileInputStream);

			String site = prop.getProperty("baseURL");

			// печатаем полученные данные в кон�?оль

			System.out.println("baseURL: " + site

			);

		} catch (IOException e) {
			System.out.println("Ошибка в программе: файл " + Go + " не обнаружено");
			e.printStackTrace();
		}

	}

}
