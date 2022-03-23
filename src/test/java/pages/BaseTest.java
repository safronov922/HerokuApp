package pages;

import org.openqa.selenium.WebDriver;


abstract public class BaseTest {
    WebDriver driver;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

}
