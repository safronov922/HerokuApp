package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class SendFileTest extends BaseTest{
    @Test
    public void checkUploadFileTextTest(){
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        String text = fileUploadPage
                .openFileUploadPage()
                .clickChoseFileButton("C:\\HerokuApp\\src\\test\\resources\\123.jpg")
                .sendUploadFile()
                .getText();
        Assert.assertEquals(text,"123.jpg", "Text unexpected");
    }
}
