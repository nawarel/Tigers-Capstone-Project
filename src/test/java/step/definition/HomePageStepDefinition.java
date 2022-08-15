package step.definition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition  extends Base{

	HomePageObject homepageObj=new HomePageObject();
	
	
//***scenario1
	
@When("User click on Currency")
public void user_click_on_currency() {
	homepageObj.clickOnCurrencyTab();
  logger.info("user clicked on currencyTab successfully");
}

@When("User Choose Euro from dropdown")
public void user_choose_euro_from_dropdown() {
	homepageObj.ClickOnEuroBttn();
	logger.info("User Choosed Euro from dropdown");
}

@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
   String expected="€";
   String actualtext=homepageObj.GetTextEuroCurrency();
   Assert.assertEquals(expected, actualtext);
   logger.info("currency value changed to Euro successfully");
}
//***Scenario 2
@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
	homepageObj.ClickOnShoppingCartTab();
	logger.info("User clicked on shopping cart successfully ");
}

@Then("{string} message should display")

public void message_should_display(String string) throws InterruptedException, IOException {

    String expectedText = "Your shopping cart is empty!";

    String actualText = homepageObj.GetTextDisplayMsg();

    Assert.assertEquals(expectedText, actualText);

    logger.info("Your shopping cart is empty");
    Utils.takeScreenShot("HomePageScreenShot");

    Thread.sleep(2000);
	
	
	
	
	

}
	
}
