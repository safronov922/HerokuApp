package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class InputsPage extends BasePage {

    private By INPUT = By.cssSelector("[type=\"number\"]");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(WebUrls.INPUTS);
    }

    public String getInputValue() {
        return driver.findElement(INPUT).getAttribute("value");
    }

    public void sendingKeys() {
        driver.findElement(INPUT).sendKeys(Keys.ARROW_UP);
        driver.findElement(INPUT).sendKeys(Keys.ARROW_UP);
        driver.findElement(INPUT).sendKeys(Keys.ARROW_UP);
        driver.findElement(INPUT).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(INPUT).sendKeys(Keys.ARROW_DOWN);
    }
}
