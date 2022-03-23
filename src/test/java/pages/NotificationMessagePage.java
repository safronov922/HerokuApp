package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class NotificationMessagePage extends BaseTest {

    private By BUTTON = By.xpath();
    private By MESSAGE = By.xpath("//a[@class='close']/..");

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationPage() {
        driver.get(WebUrls.NOTIFICATION_MESSAGE);
    }

    public void clickButton() {
        driver.findElement(BUTTON).click();
    }

    public String getMessage() {
        return driver.findElement(MESSAGE).getText().replace("×", "").trim();
    }
}
