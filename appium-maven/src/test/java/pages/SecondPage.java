package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPage extends MainPage {

    public SecondPage(AndroidDriver ad) {
        super(ad);
    }

    public SecondPage clickOnPrimeroButton(AndroidDriver ad) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(ad, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonUno"))).click();
        return this;
    }
}
