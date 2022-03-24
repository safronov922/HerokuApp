package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class CheckBoxesPage extends BasePage {

    private By CHECKBOX_FIRST = By.xpath("(//input)[1]");
    private By CHECKBOX_SECOND = By.xpath("(//input)[2]");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckboxFirst() {
        driver.findElement(CHECKBOX_FIRST).click();
    }

    public void clickCheckboxSecond() {
        driver.findElement(CHECKBOX_SECOND).click();
    }

    public void openCheckboxPage() {
        driver.get(WebUrls.CHECKBOXES);
    }

    public boolean getCheckBoxFirstStatus() {
        return driver.findElement(CHECKBOX_FIRST).isSelected();
    }

    public boolean getCheckBoxSecondStatus() {
        return driver.findElement(CHECKBOX_SECOND).isSelected();
    }
}
