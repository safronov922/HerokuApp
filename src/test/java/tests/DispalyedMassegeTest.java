package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.NotificationMessagePage;


public class DispalyedMassegeTest extends BaseTest {

    NotificationMessagePage notificationMessagePage;

    @Test
    public void checkMessageTest() {
        notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationPage();
        notificationMessagePage.clickButton();
        String message = notificationMessagePage.getMessage();
        Assert.assertEquals(message, "Action successful");
    }
}
