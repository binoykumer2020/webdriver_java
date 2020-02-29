package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage (WebDriver driver){
        this.driver=driver;
    }
    // if you a number of images with the messages

    // java doc
    /**
     *
     * @param index starts at 2
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));

    }

    // Because thw way all the figures are implemented with some texts --> figureCaption for example
    // we need to create a inner class within the Hovers(Main) class + constructor to handle this
    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link   = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption=caption;
            // so we are hover the figure caption element then will return FigureCaption back to our hoverfigure
        }

        public boolean isCaptionDisplayed (){
            return caption.isDisplayed();
        }
        public String getTitle(){
           return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText (){
            return caption.findElement(link).getText();
        }

    }
}
