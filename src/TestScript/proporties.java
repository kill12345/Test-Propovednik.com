package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class proporties {
	
	


	public static void main(String[] args) {
		
		
	      String Go = "C:/Users/Stepa/Workspace/WebDriverProject/src1/property.file";
		  FileInputStream fileInputStream;
		  
		  
	        //инициализируем специальный объект Properties
	        //типа Hashtable для удобной работы с данными
		  
	        Properties prop = new Properties();
	 
	        try {
	            //обращаемся к файлу и получаем данные
	            fileInputStream = new FileInputStream(Go);
	            prop.load(fileInputStream);
	 
	            String site = prop.getProperty("baseURL");
	            
	 
	            //печатаем полученные данные в консоль
	            
	            System.out.println(
	                    "baseURL: " + site
	                    
	            );
	 
	        } catch (IOException e) {
	            System.out.println("Ошибка в программе: файл " + Go + " не обнаружено");
	            e.printStackTrace();
	        }
	 
	    }
	 
	}
	