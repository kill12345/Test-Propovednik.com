package TestsPckgOne;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_0 extends BaseClass {

    @Test

    public void testedSomePaje() throws InterruptedException {

        WebDriver driver = getDriverInstance();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"q\"]"));
        driver.wait(




        );

    }

}
