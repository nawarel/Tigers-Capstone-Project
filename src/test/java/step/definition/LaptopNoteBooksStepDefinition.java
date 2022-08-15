package step.definition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;


public class LaptopNoteBooksStepDefinition extends Base  {
	
	LaptopNoteBooksPageObject laptopNoteBooksPageObj=new LaptopNoteBooksPageObject();
	
	//Background
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksPageObj.ClickOnlaptopsNotebooksTab();
		
		logger.info("user clicked on Laptop &note Book tab successfully");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksPageObj.ClickOnShowAllLaptopsNoteBooks();
		logger.info("User clicked on show all laptopand noteBook option successfully");
	}

	//***Scenario 1
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNoteBooksPageObj.ClickOnMacBookItemtab();
		logger.info("ueser clicked on MacBook Item successfully");
	}



	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopNoteBooksPageObj.ValidateSuccessMesgFromUI();
		logger.info("user able to see message successfully");
	}

	@Then("User should see {int} tem\\(s){int}.00showed to the cart")
	public void user_should_see_tem_s_00showed_to_the_cart(Integer int1, Integer int2) {
		laptopNoteBooksPageObj.VerifiedItemAddToTheCartFromUI();
		logger.info("user able to see the item on the cart successfully");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBooksPageObj.ClickOnAddCarOption();
		logger.info("user clicked on cart option successfully");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObj.ClickOnRemoveBttn();
		logger.info("user clicked on red X bttn successfully");
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopNoteBooksPageObj.VerifiedItemRemovedFromCartUI();
		logger.info("item should be removed successfully");
	}
//***Scenario 2
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNoteBooksPageObj.ClickOnproductComparisonOnMacBook();
		logger.info("user clicked on product comparison icon on MacBook successfully");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNoteBooksPageObj.ClickOnproductComparisonOnMacBookAir();
		logger.info("User clicked on product comparison icon on ‘MacBook Air successfully");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		laptopNoteBooksPageObj.MacBookAndMacBookAirProductComparison();
		logger.info("user able to see message of success");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBooksPageObj.ClickOnproductComparisonLink();
		logger.info("User clicked on Product comparison link successfully");
		
	    	}
	@Then("User should see Product Comparison ChartScenario: Adding an item to Wish list")
	public void user_should_see_product_comparison_chart_scenario_adding_an_item_to_wish_list() {
		laptopNoteBooksPageObj.GetTextFromUIproductComparisonChart(); 
		logger.info("User able to see Product Comparison ChartScenario: Adding an item to Wish list successfully");
	}


	
//***Scenario 3
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopNoteBooksPageObj.ClickOnAddSonyVaIOToWishList();
		logger.info("User clicked on heart icon to add ‘Sony VaIO’ laptop to wish list successfully");
	}
	

@Then("User should get a message'You must login or create an account to save Sony VAIO to your wish list!'")
public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException {
  
Assert.assertTrue(laptopNoteBooksPageObj.VerifiedYouGetMessegFromUI());


        Thread.sleep(2000);
	
	}
//*** Scenario 4
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopNoteBooksPageObj.ClickOnMacBookProItem();
		logger.info("User clicked on ‘MacBook Pro’ item successfully");
	}

	
		
		@Then("User should see  {string}  price tag is present on UI.")
		public void user_should_see_price_tag_is_present_on_ui(String string) throws IOException {
			Assert.assertTrue(laptopNoteBooksPageObj.VerifiedThePriceMacBookProOnUI());
			
			logger.info("user able to see the price tag ");
			Utils.takeScreenShot("LaptopNoteBooksScreenShot");
		}

	}


	
	
