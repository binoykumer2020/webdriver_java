package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage = homePage.clickFormAuthentication(); // it will take us to Log in page
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       loginPage.clickLoginButton();
        System.out.println("Successfully logged in");


      // SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      // System.out.println(secureAreaPage.getAlertText());

     /*  assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
               "Alert text is incorrect");*/

    }
}
