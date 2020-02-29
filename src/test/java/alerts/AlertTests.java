package alerts;


import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert (){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        // dynamic data can be implemented as this alert text can be changed at any point of time
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Results not correct");
    }

    // another type of alert which ok and cancel button
    @Test
    public void testGetTextFromAlert (){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        // As we are getting text
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text = "Binoy rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text, "Results text incorrect");

    }
}
