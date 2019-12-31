package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LastPage extends MainPage{

    public LastPage(AndroidDriver ad) {
        super(ad);
    }

    public LastPage clickOnSorteaButton(AndroidDriver ad) {
        WebDriverWait wait = new WebDriverWait(ad, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonSortear"))).click();
        //ad.findElementById("buttonSortear").click();
        return this;
    }

    public LastPage typeWord(AndroidDriver ad, String word) {
        sleep(1000);
        ad.findElementById("editTextEntrada").sendKeys(word);
        return this;
    }

    public LastPage clickOnCompraButton(AndroidDriver ad) {
        WebDriverWait wait = new WebDriverWait(ad, 120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("buttonComprobar"))).click();
        //ad.findElementById("buttonComprobar").click();
        return this;
    }

    public void sleep(int val) {
        try {
            Thread.sleep(val);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
