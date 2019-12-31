package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pages.LastPage;
import pages.SecondPage;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Przemek on 21.04.2017.
 */
public class TestSteps extends MainTest {


	private HomePage homePage = new HomePage(ad);
	private SecondPage secondPage = new SecondPage(ad);
	private LastPage lastPage = new LastPage(ad);

	@Before
	public void beforeScenario() throws MalformedURLException {beforeClass();}

	@After
	public void afterScenario() {/*afterClass();*/}

	@Given("^I click on Espanol button$")
	public void iClickOnEspanolButton() throws MalformedURLException {
		homePage.clickOnEspanolButton(ad);
	}

	@And("^I click on Primero button$")
	public void iClickOnPrimeroButton() throws InterruptedException {
		secondPage.clickOnPrimeroButton(ad);
	}

	@When("^I click on Sortea button$")
	public void iClickOnSorteaButton() {
		lastPage.clickOnSorteaButton(ad);
	}

	@And("^Type word \"([^\"]*)\"$")
	public void typeWord(String word) throws Throwable {
		lastPage.typeWord(ad, word);
	}

	@And("^I click on Compra button$")
	public void iClickOnCompraButton() {
		lastPage.clickOnCompraButton(ad);
	}
}
