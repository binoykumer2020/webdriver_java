package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.openqa.selenium.Keys.BACK_SPACE;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("Binoy" + BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi (){
       KeyPressesPage keypage = homePage.clickKeyPresses();
       keypage.enterPi();

    }

}
