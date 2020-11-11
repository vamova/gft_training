package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.clickAlert();
        alertsPage.acceptAlert();
       Assert.assertEquals(alertsPage.getResultText(), "You successfuly clicked an alert", "Incorrect text");
    }

    @Test
    public void testGetTextAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.clickAlert2();
        String text = alertsPage.getTextAlert2();
        alertsPage.cancelAlert();
        Assert.assertEquals(text,"I am a JS Confirm", "Incorrect Alert Text");
    }

    @Test
    public void testSetInputAlert(){
        var alertsPage  = homePage.clickAlertsPage();
        alertsPage.clickAlert3();

    }
}
