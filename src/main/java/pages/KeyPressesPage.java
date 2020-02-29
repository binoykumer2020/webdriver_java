package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage  {

    private WebDriver driver;
    private By inputField = By.id("target"); // this is the object element
    private By resultText = By.id("result");


    public KeyPressesPage (WebDriver driver){ // constructor to initiate the driver
        this.driver=driver;
    }

    // methods for input field to return
    public void enterText (String text){
        driver.findElement(inputField).sendKeys(text);
    }

    // this one return the string
    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    // think you need to put some special character i.e. pi π

    public void enterPi (){
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }

}
