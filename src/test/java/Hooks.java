import functionLibrary.CommonFunctions;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest()
    {
        commonFunctions.openBrowser();
    }

    @After
    public void afterTest()
    {
        commonFunctions.closeBrowser();
    }
}

