package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;


public class DataTablesPage extends  BaseTest{

    private By NAME = By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]");
    private By SURNAME = By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]");
    private By DUE = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[1]");
    private By WEB = By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[2]");

    public DataTablesPage(WebDriver driver) {
        super(driver);
    }
    public void openDataTablesPage(){
        driver.get(WebUrls.DATA_TABLES);
    }
    public String getName(){
       return driver.findElement(NAME).getText();
    }
    public String getSurname(){
        return driver.findElement(SURNAME).getText();
    }
    public String getDue(){
        return driver.findElement(DUE).getText();
    }
    public String getWeb(){
        return driver.findElement(WEB).getText();
    }
}
