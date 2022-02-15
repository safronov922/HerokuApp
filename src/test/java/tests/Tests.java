package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class Tests extends BaseTest {
    @Test
    public void addRemove() {
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
}
