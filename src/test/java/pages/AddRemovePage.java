package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AddRemovePage extends BasePage {

    private By ADD_ELEMENT_BUTTON = By.xpath("//button[text()='Add Element']");
    private By DELETE_BUTTON = By.xpath("//div[@id='elements']//button[last()]");


    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemovePage() {
        driver.get(WebUrls.ADD_REMOVE);
    }

    public void clickAddButton() {
        driver.findElement(ADD_ELEMENT_BUTTON).click();
    }

    public void clickRemoveButton() {
        driver.findElement(DELETE_BUTTON).click();
    }

    public boolean checkDeleteButton() {
        return driver.findElement(By.xpath("//div[@id='elements']//button")).isDisplayed();
    }
}
