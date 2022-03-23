package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;
import staticdata.WebUrls;

public class CheckBoxesTest extends BaseTest {
    CheckBoxesPage checkBoxesPage;

    @Test
    public void checkFirstCheckBoxTest() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckboxPage();
        Assert.assertFalse(checkBoxesPage.getCheckBoxFirstStatus(), "Checkbox checked");
        checkBoxesPage.clickCheckboxFirst();
        Assert.assertTrue(checkBoxesPage.getCheckBoxFirstStatus(), "Checkbox unchecked");
    }

    @Test
    public void checkSecondCheckBoxTest() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckboxPage();
        Assert.assertTrue(checkBoxesPage.getCheckBoxSecondStatus(), "Checkbox unchecked");
        checkBoxesPage.clickCheckboxSecond();
        Assert.assertFalse(checkBoxesPage.getCheckBoxSecondStatus(), "Checkbox checked");
    }
}
