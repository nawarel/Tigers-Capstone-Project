package step.definition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import utilities.Utils;

public  class DesktopPageStepDefinition extends Base{

	DesktopPageObject  DeskPageObj=new DesktopPageObject() ;
	//***Background
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		DeskPageObj.getUserClikOnDesktopTab();
		logger.info("user able to click on desktop succefully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws InterruptedException {
		DeskPageObj.getUserClickOnShowAllDesktops();
		logger.info("user able to click on show all desktop successfully");
		Thread.sleep(2000);
	//*** SCENARIO 1
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		DeskPageObj.DesktopsItems();
		logger.info(" user able to see all items present on DeskTOP page");
	}
 // SCENARIO 2
	@And("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_HP_LP3065item() {
		DeskPageObj.ClickHPLP3065ToCartLink();
		logger.info("User clicked to add cart option on HP LP3065item");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		DeskPageObj.SelectQuantity("1");
	}
	@And("User click add to Cart button")
	public void User_click_add_to_Cart_button() {
		DeskPageObj.UserclickAddToCartHP();
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_Hp_LP_to_your_shopping_cart(Integer int1) {
		String ExpectedText="Success: you have added HP LP 3065 to your Shopping cart!";
		String ActualText = DeskPageObj.GetSuccessMessage();
		 Assert.assertEquals(ExpectedText,ActualText );
		logger.info("user able to see success Msg");
	}
//*** SCENARIO 3

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		DeskPageObj.ClickOnCanonEOS5DCamera();
		logger.info("User clicked on add cart to add canon EOS 5Ditem");
	}

	@When("User select color from dropdown RedAnd User select quantity {int}")
	public void user_select_color_from_dropdown_red_and_user_select_quantity(Integer int1) {
		DeskPageObj.RedColorFromDropDown();
		logger.info(" user able to select color from DropDown");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		DeskPageObj.GetSuccessMessageToAddCanonCamera();
		logger.info("user able to see success message ");
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		DeskPageObj.ClickOnCanonEOS5DCamera();
		logger.info("user clicked on canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		DeskPageObj.UserclickOnWriteReviewlink();
		logger.info("user clicked on write review successflly");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		  List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		  DeskPageObj.UserNameInput(data.get(0).get("yourname"));

		  DeskPageObj.UserEntertextAreaInput(data.get(0).get("yourReview"));
		  DeskPageObj.selectRating(data.get(0).get("Rating"));
		 

	      logger.info("user was able to fill the review  information successfully");
	}
	@When("User Click on Continue button")
	public void user_click_on_continue_button() {
		DeskPageObj.UserClickOnContinueBttn();
		logger.info("user clicked on Continue bttn successfully");
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws IOException {
		DeskPageObj.SuccessMsgFromReviewProduct();
		logger.info(" user  able to see a messge with ‘Thank you for your review. It has been submitted to the webmaster for approval ");
		Utils.takeScreenShot("DesktopPageScreenShot");
	}
	
	
	

}