package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputArrowSendingTest extends BaseTest {

    @Test
    public void checkDigitsEnteringTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.sendingKeys();
        String count = inputsPage.getInputValue();
        Assert.assertEquals(count, "1");
    }
}
