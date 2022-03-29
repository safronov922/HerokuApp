package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class AlertsTest extends BaseTest {
    JavaScriptAlertsPage javaScriptAlertsPage;

    @Test
    public void checkAlertJsTest() {
        javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        String actualText = javaScriptAlertsPage
                .openJsAlertPage()
                .clickButtonJsAlert()
                .getAlertText();
        Assert.assertEquals(actualText, "I am a JS Alert");
    }

    @Test
    public void checkAlertConfirmTest() {
        javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        String actualText = javaScriptAlertsPage
                .openJsAlertPage()
                .clickButtonJsConfirm()
                .getAlertConfirmText();
        Assert.assertEquals(actualText, "I am a JS Confirm");
    }

}
