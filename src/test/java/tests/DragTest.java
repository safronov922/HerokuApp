package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DrugPage;

public class DragTest extends BaseTest {
    @Test
    public void dragAndDropTest(){
        DrugPage drugPage = new DrugPage(driver);
        String text = drugPage.openPage().dragFile().getDragText();
        Assert.assertEquals(text,"Dropped!", "Message wrong");
    }
}