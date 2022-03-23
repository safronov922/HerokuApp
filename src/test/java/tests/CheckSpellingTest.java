package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;


public class CheckSpellingTest extends BaseTest {
    TyposPage typosPage;

    @Test
    public void checkTextSpellingTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        String text1 = typosPage.getText1();
        String text2 = typosPage.getText2();
        String text3 = typosPage.getText3();
        Assert.assertEquals(text1, "Typos");
        Assert.assertEquals(text2, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        Assert.assertEquals(text3, "Sometimes you'll see a typo, other times you won't.");
    }
}
