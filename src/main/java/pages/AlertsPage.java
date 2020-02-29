package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
    private WebDriver driver;
    // for an object element whatif we dont have identifier and we have seen jsmethod and
    // this function could be changed  may be xpath could be a solution
    // xpath: .//button[text()="Click for JS Alert"]

    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    // a new alert to cancel
    private By getTriggerConfirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    // a new alert for the prompt
    private By gettriggerPromptButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");

    private By results = By.id("result");



    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
        // now once you click it you should get an alert lets create a method
    }
    public void triggerConfirm(){
        driver.findElement(getTriggerConfirmButton).click();
    }
    // for prompt alert
    public void triggerPrompt(){
        driver.findElement(gettriggerPromptButton).click();
    }

    // as we have an alert text
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }


    public void alert_clickToAccept(){
        // as this not an webelement and we cant use driver.
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
        // remember that before the click we should see the text..lets create a method to getText
    }


    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }

    public String getResult (){
       return driver.findElement(results).getText();
    }



}
