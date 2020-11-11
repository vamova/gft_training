package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";

        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number");
        assertTrue(selectedOptions.contains(option), "Option is not correct");


    }
}
