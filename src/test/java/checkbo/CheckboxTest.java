package checkbo;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest {

    @Test
    public void testSelectCheckbox(){
        CheckboxPage checkboxPage = homePage.clickCheckbox();
        checkboxPage.selectCheck1();
    }
}
