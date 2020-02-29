package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1 (){
      HoversPage hoversPage =  homePage.clickHovers();
     // hoversPage.hoverOverFigure(1); // don't find var
      assertTrue( hoversPage.hoverOverFigure(2).isCaptionDisplayed(), "Caption not displayed");
      assertEquals( hoversPage.hoverOverFigure(2).getTitle(), "name: user2",
              "Caption title is incorrect");
        assertEquals( hoversPage.hoverOverFigure(2).getLinkText(), "View profile",
                "Caption link is incorrect");
        // sometimes href link can be changed i.e. https to http so relative path would be an appropriate choice
        assertTrue(hoversPage.hoverOverFigure(2).getLink().endsWith("/users/2"), "Link incorrect");


    }
}
