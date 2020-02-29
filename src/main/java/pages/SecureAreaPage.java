package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    // as we can see the navigated page to go secure area page and has banner
    private By statusAlert = By.xpath("//div[@id='flash']");
    // now for example we would like to read from the status alert ..so better need create Text method

    public SecureAreaPage (WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText (){
        return  driver.findElement(statusAlert).getText();
    }
}
