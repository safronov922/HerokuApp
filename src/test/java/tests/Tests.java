package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTest;
import staticdata.WebUrls;

public class Tests extends BaseTest {






    @Test
    public void checkDigitsEnteringTest() {
        driver.get(WebUrls.INPUTS);
        WebElement input = driver.findElement(By.cssSelector("[type=\"number\"]"));
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
    }

    @Test
    public void checkTextSpellingTest() {
        driver.get((WebUrls.TYPOS));
        String text1 = driver.findElement(By.xpath("//h3[contains(text(),'Typos')]")).getText();
        String text2 = driver.findElement(By.xpath("(//p)[1]")).getText();
        String text3 = driver.findElement(By.xpath("(//p)[2]")).getText();
        Assert.assertEquals(text1, "Typos");
        Assert.assertEquals(text2, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        Assert.assertEquals(text3, "Sometimes you'll see a typo, other times you won't.");
    }

    @Test
    public void checkMessageTest() {
        driver.get(WebUrls.NOTIFICATION_MESSAGE);
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        String message = driver.findElement(By.xpath("//a[@class='close']/..")).getText().replace("×", "").trim();
        Assert.assertEquals(message, "Action successful");
    }
}
