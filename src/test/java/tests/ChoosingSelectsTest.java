package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelectPage;

public class ChoosingSelectsTest extends BaseTest {
    @Test
    public void choosingSelectorsTest() {
        SelectPage selectPage = new SelectPage(driver);
        Assert.assertEquals(selectPage.openPage().findAllElements(), 3);
        boolean firstOption = selectPage.chooseFirstElement();
        Assert.assertTrue(firstOption, "Not choose first");
        boolean secondOption = selectPage.chooseSecondElement();
        Assert.assertTrue(secondOption, "Not choose second");
    }
}
