package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   //  private By formAuthenticationLink = By.linkText("Form Authentication");
    //  as we make some generic method called  clickLink

    private WebDriver driver;

    // Because we create a metods here shall we start with a constructor

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication (){

        clickLink("Form Authentication");
       // driver.findElement(formAuthenticationLink).click();
        // if it takes a new object page, customary in POM if your actions changes
        // the page then we should now return a handler then we should return log in page
        return new LoginPage (driver);
        // now we need to create a LoginPage class --> as a handler
    }

    public DropdownPage clickDropdown (){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }


    // But as we can see that we have a number of links in the web page
    // we have design our page now Because most of them got linkText link lets create a generic method
    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage (driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    // File upload --> this is called handler

    public FileUploadPage clickFileUpload (){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }



}
