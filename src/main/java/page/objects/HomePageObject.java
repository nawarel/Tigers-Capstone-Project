package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject  extends Base{


	public HomePageObject() {
	
		PageFactory.initElements(driver, this);
	}
	//SCENARIO1
	
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement CurrencyTab;
	
	public  void clickOnCurrencyTab() {
		CurrencyTab.click();
	}
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement EuroBttn;
	
	public  void ClickOnEuroBttn() {
		EuroBttn.click();
	
	}
	
	@FindBy(xpath="//button//strong[text()='€']")
	private WebElement EuroCurrency;
	
	public String GetTextEuroCurrency() {
		
		String TextUI=EuroCurrency.getText();
		return TextUI;
		
	}

	//SCENARIO2
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement ShoppingCartTab;
	
	public  void ClickOnShoppingCartTab() {
		ShoppingCartTab.click();
		
	}
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement DisplayMsgThatCartIsEmpty;
	
	
	
	
	public String GetTextDisplayMsg() {
		String TextUi = DisplayMsgThatCartIsEmpty.getText();
		return TextUi;
	}
}