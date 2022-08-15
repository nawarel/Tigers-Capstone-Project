package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject  extends Base{


	public DesktopPageObject() {
	
		PageFactory.initElements(driver, this);
	}
	//Background
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement DesktopTab;
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;
	
	@FindBy(tagName="img")
	private List<WebElement> items;
	
	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement UserClickOnHPLP3065ToCart;
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement InputQuantity;
	@FindBy (xpath="//button[text()='Add to Cart']")
	private WebElement clickAddToCartHP;
	@FindBy(xpath ="")
	private WebElement SuccessMessage;
	// *****Scenario 
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DCamera;
	@FindBy(xpath="//select[@id='input-option226']/option[2]")
	private WebElement SelectRedColorFromDropDown;
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement SelectQte;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement AddToCartCanonEOS;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/a[text()='Canon EOS 5D Camera']")
	private WebElement SuccessMessageToAddCanonCamera;
	//*****Scenario 3
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement clickOnWriteReviewlink;
	@FindBy(xpath="//input[@name='name']")
	private WebElement NameInput;
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement textAreaInput;
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement>TextRating;
	@FindBy(xpath="//input[@value='5']")
	private WebElement RatingValueGood;
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement ContinueBttn;
	@FindBy(xpath="//textarea")
	private WebElement ReviewProduct;
	
	//Scenario 1
	public  void  getUserClikOnDesktopTab () {
		DesktopTab.click();
	}
	
    public void  getUserClickOnShowAllDesktops(){
    	ShowAllDesktops.click();
    }
    public  List<WebElement>  DesktopsItems() {
    	List<WebElement> ItemsDesk=items;
		return ItemsDesk;
    	
    }
    ////////////////////////////////////////////////////////////

    public void  ClickHPLP3065ToCartLink() {
    	UserClickOnHPLP3065ToCart.click();
     }
    
    public void SelectQuantity(String valueQte) {
    	InputQuantity.clear();
    	InputQuantity.sendKeys(valueQte);
    }
    public void UserclickAddToCartHP() {
    	clickAddToCartHP.click();
    }
    
	public String GetSuccessMessage() {
		return SuccessMessage.getText();
	}
	/////////////////////////////////////////////////////////
	public void ClickOnCanonEOS5DCamera() {
		CanonEOS5DCamera.click();
	}
	public void RedColorFromDropDown() {
		SelectRedColorFromDropDown.click();
	}
	public void UserSelectQte() {
		SelectQte.clear();
		SelectQte.sendKeys("1");
	}
	public void UserAddToCartCanonEOS() {
		AddToCartCanonEOS.click();
	}
	public String GetSuccessMessageToAddCanonCamera() {
		return SuccessMessageToAddCanonCamera.getText();
	}
	//***Scenario 3
	
	
	public void UserclickOnWriteReviewlink() {
		clickOnWriteReviewlink.click();
	}
	public String UserNameInput(String name) {
		NameInput.sendKeys(name);
		return name;
		
	}
	public String UserEntertextAreaInput(String text) {
		return text ;
		}
	   public void selectRating(String ratingValue) {
		    List<WebElement> ratingElements = TextRating;
		    for (WebElement element : ratingElements) {
		        if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
		        element.click();    
		        break;
		        }
		    }
		    }
	public void  UserClickOnContinueBttn() {
	ContinueBttn.click();
		
	}
	public String SuccessMsgFromReviewProduct() {
		return  ReviewProduct.getText();
	}}