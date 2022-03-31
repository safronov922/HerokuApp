package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import staticdata.WebUrls;

public class DrugPage extends BasePage {
    private By IFRAME = By.className("demo-frame");
    private By A = By.id("draggable");
    private By B = By.id("droppable");

    public DrugPage(WebDriver driver) {
        super(driver);
    }

    public DrugPage openPage() {
        driver.get(WebUrls.DROP_URL);
        return this;
    }

    public DrugPage dragFile() {
        driver.switchTo().frame(driver.findElement(IFRAME));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(A), driver.findElement(B)).build().perform();
        return this;
    }

    public String getDragText() {
        return driver.findElement(B).getAttribute("innerText");
    }
}
