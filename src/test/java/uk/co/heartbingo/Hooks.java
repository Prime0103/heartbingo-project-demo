package uk.co.heartbingo;


import org.junit.After;
import org.junit.Before;
import uk.co.heartbingo.propertyreader.PropertyReaders;
import uk.co.heartbingo.utilities.Utility;

import java.io.IOException;

public class Hooks extends Utility
{
    @Before
    public void setUp(){
        selectBrowser(PropertyReaders.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown()   {
       // if (scenario.isFailed()) {
            //String screeShotPath = Utility.getScreenshot(driver, scenario.getname().replace(" ", "_"));
           // try {
               // Reporter.addScreenCaptureFromPath(screeShotPath);
           // } catch (IOException e) {
               // throw new RuntimeException(e);
          //  }
      //  }
       // closeBrowser();
    }
}
