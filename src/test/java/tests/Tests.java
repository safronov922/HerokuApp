package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.mustache.Value;
import staticdata.WebUrls;

public class Tests extends BaseTest {
    @Test
    public void addRemoveTest() {
        //Open page
        driver.get(WebUrls.ADD_REMOVE);
        //Add first element
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //Add second element
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //Delete last element
        driver.findElement(By.xpath("//div[@id='elements']//button[last()]")).click();
        //Check button Delete shown
        boolean isButtonDeleteShown = driver.findElement(By.xpath("//div[@id='elements']//button")).isDisplayed();
        Assert.assertTrue(isButtonDeleteShown, "Button don't shown");
    }

    @Test
    public void checkNameTest() {
        //Open page
        driver.get(WebUrls.DATA_TABLES);
        //Find Name
        String name = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")).getText();
        //Find Surname
        String surname = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")).getText();
        //Check Name and Surname correct
        Assert.assertEquals(surname, "Bach");
        Assert.assertEquals(name, "Frank");
    }

    @Test
    public void checkPriceTest() {
        //Open page
        driver.get(WebUrls.DATA_TABLES);
        //Find Due
        String due = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[1]")).getText();
        //Find Web Site
        String web = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[2]")).getText();
        //Check Due and Web Site correct
        Assert.assertEquals(due, "$51.00");
        Assert.assertEquals(web, "http://www.frank.com");
    }

    @Test
    public void checkFirstCheckBoxTest() {
        driver.get(WebUrls.CHECKBOXES);
        WebElement checkBox1 = driver.findElement(By.xpath("(//input)[1]"));
        Assert.assertFalse(checkBox1.isSelected(), "Checkbox checked");
        driver.findElement(By.xpath("(//input)[1]")).click();
        Assert.assertTrue(checkBox1.isSelected(), "Checkbox unchecked");
    }

    @Test
    public void checkSecondCheckBoxTest() {
        driver.get(WebUrls.CHECKBOXES);
        WebElement checkBox2 = driver.findElement(By.xpath("(//input)[2]"));
        Assert.assertTrue(checkBox2.isSelected(), "Checkbox unchecked");
        driver.findElement(By.xpath("(//input)[2]")).click();
        Assert.assertFalse(checkBox2.isSelected(), "Checkbox checked");
    }

    @Test
    public void checkDigitsEnteringTest() {
        driver.get(WebUrls.INPUTS);
        WebElement input = driver.findElement(By.cssSelector("[type=\"number\"]"));
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        String count = input.getAttribute("value");
        Assert.assertEquals(count,"1");
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
