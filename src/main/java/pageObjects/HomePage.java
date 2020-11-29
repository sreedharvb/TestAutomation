package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driverPage;
    public HomePage(WebDriver driver)
    {
        this.driverPage = driver;
        PageFactory.initElements(driver, this);
    }

}
