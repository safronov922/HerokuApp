package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import staticdata.WebUrls;

public class AddRemoveTest extends BaseTest {
    AddRemovePage addRemovePage;
    @Test
    public void addRemoveTest() {
        addRemovePage = new AddRemovePage(driver);
        //Open page
        addRemovePage.openAddRemovePage();
        //Add first element
        addRemovePage.clickAddButton();
        //Add second element
        addRemovePage.clickAddButton();
        //Delete last element
        addRemovePage.clickRemoveButton();
        //Check button Delete shown
        Assert.assertTrue(addRemovePage.checkDeleteButton(), "Button don't shown");
    }

}
