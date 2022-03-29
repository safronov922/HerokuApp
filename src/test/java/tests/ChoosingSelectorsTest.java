package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelectPage;

public class ChoosingSelectorsTest extends BaseTest{
    @Test
    public void choosingSelectorsTest(){
        SelectPage selectPage = new SelectPage(driver);
        boolean firstOption = selectPage
                .openPage()
                .chooseFirstElement();
        Assert.assertTrue(firstOption,"Not choose first");
        boolean secondOption = selectPage.chooseSecondElement();
        Assert.assertTrue(secondOption, "Not choose second");
    }

}
