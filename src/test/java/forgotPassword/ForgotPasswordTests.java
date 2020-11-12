package forgotPassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTest {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("test@test.com");
        Assert.assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!", "Message is incorrect");
    }

    @Test
    public void testone(){

    }
}
