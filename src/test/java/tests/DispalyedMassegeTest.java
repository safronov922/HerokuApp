package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.NotificationMessagePage;


public class DispalyedMassegeTest extends BasePage {
    NotificationMessagePage notificationMessagePage;

    @Test
    public void checkMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationPage();
        notificationMessagePage.clickButton();
        String message = notificationMessagePage.getMessage();
        Assert.assertEquals(message, "Action successful");
    }
}
