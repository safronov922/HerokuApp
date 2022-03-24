package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputArrowSendingTest extends BasePage {
    InputsPage inputsPage;

    @Test
    public void checkDigitsEnteringTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.sendingKeys();
        String count = inputsPage.getInputValue();
        Assert.assertEquals(count, "1");
    }
}
