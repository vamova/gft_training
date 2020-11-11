package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHide(){
        var loadingPage = homePage.clickDynamicPage().clickExample1();
        loadingPage.ClickStart();
        Assert.assertEquals(loadingPage.getTextLoaded(), "Hello World!", "loaded text incorrect");
    }

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicPage().clickExample2();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
