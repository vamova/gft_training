package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickUploadPage();
        uploadPage.uploadFile("C:\\Users\\vame\\Desktop\\automation_training\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Failed");
    }
}
