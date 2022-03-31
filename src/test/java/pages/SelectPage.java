package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import staticdata.WebUrls;

public class SelectPage extends BasePage {
    private By SELECTOR = By.id("dropdown");

    public SelectPage(WebDriver driver) {
        super(driver);
    }

    public SelectPage openPage() {
        driver.get(WebUrls.DROPDAWN_URL);
        return this;
    }

    public int findAllElements() {
        Select select = new Select(driver.findElement(SELECTOR));
        return select.getOptions().size();
    }

    public boolean chooseFirstElement() {
        Select select = new Select(driver.findElement(SELECTOR));
        select.selectByIndex(1);
        boolean s = select.getOptions().get(1).isSelected();
        return s;
    }

    public boolean chooseSecondElement() {
        Select select = new Select(driver.findElement(SELECTOR));
        select.selectByIndex(2);
        boolean s = select.getOptions().get(2).isSelected();
        return s;
    }
}
