package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload (){
       FileUploadPage uploadPage = homePage.clickFileUpload();
      // uploadPage.choosefile();
        System.out.println("testing bit bucket");

       assertEquals(uploadPage.getuploadedFiles(), "chromedriver", "Incorrect files upload");
    }
}
