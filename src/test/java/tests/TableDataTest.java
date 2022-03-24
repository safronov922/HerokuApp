package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DataTablesPage;

public class TableDataTest extends BasePage {
    DataTablesPage dataTablesPage;

    @Test
    public void checkNameTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        //Open page
        dataTablesPage.openDataTablesPage();
        //Find Name
        String name = dataTablesPage.getName();
        //Find Surname
        String surname = dataTablesPage.getSurname();
        //Check Name and Surname correct
        Assert.assertEquals(surname, "Bach");
        Assert.assertEquals(name, "Frank");
    }

    @Test
    public void checkPriceTest() {
        DataTablesPage dataTablesPage = new DataTablesPage(driver);
        //Open page
        dataTablesPage.openDataTablesPage();
        //Find Due
        String due = dataTablesPage.getDue();
        //Find Web Site
        String web = dataTablesPage.getWeb();
        //Check Due and Web Site correct
        Assert.assertEquals(due, "$51.00");
        Assert.assertEquals(web, "http://www.frank.com");
    }
}
