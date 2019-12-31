package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * Created by Przemek on 21.04.2017.
 */
public class HomePage extends MainPage{


    public HomePage(AndroidDriver ad) {
        super(ad);
    }

    public HomePage clickOnEspanolButton(AndroidDriver ad) {
        WebDriverWait wait = new WebDriverWait(ad, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonEspanol"))).click();
        //ad.findElementById("buttonEspanol").click();
        return this;
    }
}
