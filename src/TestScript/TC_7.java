package TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_7 {

	@Test
	public void Test_7() throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Stepa/Workspace/WebDriverProject/browsers/geckodriver.exe");

		WebDriver driver = (WebDriver) new FirefoxDriver();

		String url = "http://propovednik.com";
		String text_case_id = "1";

		String title_expected = "Propovednik.com: Новости";

		Thread.sleep(1000);

		driver.get(url);

		String title_actual = driver.getTitle();

		if (title_expected.equals(title_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "PASSED");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("URL: \t\t\t" + url);
			System.out.println("Title Expected: \t" + title_expected);
			System.out.println("Title Actual: \t\t" + title_actual);
			System.out.println("Test Case Result: \t" + "FAILED");

		}

		driver.quit();
	}

}
