package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class TyposPage extends BaseTest {

    private By TEXT1 = By.xpath("//h3[contains(text(),'Typos')]");
    private By TEXT2 = By.xpath("(//p)[1]");
    private By TEXT3 = By.xpath("(//p)[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(WebUrls.TYPOS);
    }

    public String getText1() {
        return driver.findElement(TEXT1).getText();
    }

    public String getText2() {
        return driver.findElement(TEXT2).getText();
    }

    public String getText3() {
        return driver.findElement(TEXT3).getText();
    }
}
