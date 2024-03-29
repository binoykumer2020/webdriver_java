package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption( ){
       DropdownPage dropDownPage = homePage.clickDropdown();// it will take us dropdown page and we can store the variable
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
       List selectedOptions = dropDownPage.getSelectedOptions();

       assertEquals(selectedOptions.size(), 1, "Incorrect number of selection");
       assertTrue(selectedOptions.contains(option),"Option not selected");
    }

}
