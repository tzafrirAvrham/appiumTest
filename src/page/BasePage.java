package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BasePage {

    //Attributes
    static AndroidDriver driver;

    //Constructor
    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Functions
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }
    public String getText(By elementLocation){
        return driver.findElement(elementLocation).getText();
    }

}
