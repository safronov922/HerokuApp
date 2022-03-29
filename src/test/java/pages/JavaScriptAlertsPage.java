package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class JavaScriptAlertsPage extends BasePage{

    private By JS_ALERT_BUTTON = By.xpath("//button[@onclick = 'jsAlert()']");
    private By JS_CONFIRM_BUTTON = By.xpath("//button[@onclick = 'jsConfirm()']");
    private By JS_PROMPT_BUTTON = By.xpath("//button[@onclick = 'jsPrompt()']");
    private By PROMPT_TEXT = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }
    public JavaScriptAlertsPage openJsAlertPage(){
        driver.get(WebUrls.ALERTS_URL);
        return this;
    }

    public JavaScriptAlertsPage clickButtonJsAlert(){
        driver.findElement(JS_ALERT_BUTTON).click();
        return this;
    }

    public String getAlertText(){
        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return text;
    }
    public JavaScriptAlertsPage clickButtonJsConfirm() {
        driver.findElement(JS_CONFIRM_BUTTON).click();
        return this;
    }
    public String getAlertConfirmText(){
        String text= driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return text;
    }
    public JavaScriptAlertsPage clickButtonJsPrompt(){
        driver.findElement(JS_PROMPT_BUTTON).click();
        return this;
    }
    public String getAlertPromptText(){
        driver.switchTo().alert().sendKeys("Hello");
        String text = driver.findElement(PROMPT_TEXT).getText();
        return text;
    }

}
