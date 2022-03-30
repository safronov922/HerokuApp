package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class FileUploadPage extends BasePage {
    private By CHOSE_FILE_BUTTON = By.id("file-upload");
    private By UPLOAD_BUTTON = By.id("file-submit");
    private By FILE_UPLOADED_TEXT = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage openFileUploadPage() {
        driver.get(WebUrls.UPLOAD_URL);
        return this;
    }

    public FileUploadPage clickChoseFileButton(String path) {
        driver.findElement(CHOSE_FILE_BUTTON).sendKeys(path);
        return this;
    }

    public FileUploadPage sendUploadFile() {
        driver.findElement(UPLOAD_BUTTON).click();
        return this;
    }

    public String getText() {
        return driver.findElement(FILE_UPLOADED_TEXT).getText();
    }

}
