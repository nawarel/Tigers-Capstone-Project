package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	
	public LaptopNoteBooksPageObject() {
	
		PageFactory.initElements(driver, this);
	}
	
	
	//***Background
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooksTab;
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsNotebooksLink;

    public void ClickOnlaptopsNotebooksTab() {
	laptopsNotebooksTab.click();
	
    }

    public void ClickOnShowAllLaptopsNoteBooks() {
    ShowAllLaptopsNotebooksLink.click();


    }
	//Scenario 1
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement MacBookItemtab;
    @FindBy(xpath="//button[@id='button-cart']")
    private WebElement AddCartBttn;
    @FindBy(xpath="//div[text()='Success: You have added ']")
    private WebElement ValidateSuccessMesg;
    @FindBy(xpath="//span[text()=' 1 item(s) - $602.00']")
    private WebElement VerifiedItemAddToTheCart;
    @FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement CartOptionBttn;
    @FindBy(xpath="//button[@title='Remove']")
    private WebElement RemoveBttn;
    @FindBy(xpath="//span[text()=' 0 item(s) - $0.00']")
    private WebElement VerifiedItemRemovedFromCart;
    

   public void ClickOnMacBookItemtab() {
	   MacBookItemtab.click();
	   
   }
   public void ClickOnAddCart() {
	   
	   AddCartBttn.click();
	   
   }
   public String ValidateSuccessMesgFromUI() {
	
	String textUI=  ValidateSuccessMesg.getText();
	return textUI;
   }
   
  public String VerifiedItemAddToTheCartFromUI() {
	 String textUI=VerifiedItemAddToTheCart.getText();
	return textUI;
	 
   }
  public void ClickOnAddCarOption() {
	 CartOptionBttn.click();
	 
   }
  public void ClickOnRemoveBttn() {
	
	RemoveBttn.click();
	
  }
  public String VerifiedItemRemovedFromCartUI() {
	String textUI=VerifiedItemRemovedFromCart.getText();
	return textUI;
	
  }

    
    
//Scenario 2
    @FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement productComparisonOnMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement productComparisonOnMacBookAir;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//div[@id='content']")
	private WebElement productComparisonChart;
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
	private WebElement  MacBookAirToProductComparisonMessage;
	
	public void ClickOnproductComparisonOnMacBook() {
		
		productComparisonOnMacBook.click();

	}
	public void ClickOnproductComparisonOnMacBookAir() {
		
		productComparisonOnMacBookAir.click();

	}
	
	
	public String MacBookAndMacBookAirProductComparison() {
		
		 String text=MacBookAirToProductComparisonMessage.getText();
		return text;
	}


	public void ClickOnproductComparisonLink() {
    	productComparisonLink.click();
    }
	 public String GetTextFromUIproductComparisonChart() {
	    	String textUI=productComparisonChart.getText();
	    	return textUI;
	    }

	
		
	//*** Scenario 3
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement   AddSonyVaIOToWishList;
    @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement  GetMessegFromUI;
    
    
    public void ClickOnAddSonyVaIOToWishList() {
    	AddSonyVaIOToWishList.click();
    	
    	
    }
    
    public Boolean VerifiedYouGetMessegFromUI() {
    	Boolean textUi=GetMessegFromUI.isDisplayed();
    	return textUi ;
    	
    	
    }

   
	
	//***scenario 4
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement MacBookProItem;
    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
    private WebElement PriceTagOfMacBookPro ;
	
    public void ClickOnMacBookProItem() {

    	MacBookProItem.click();
    	}
    	public boolean VerifiedThePriceMacBookProOnUI() {
    		Boolean textUi= PriceTagOfMacBookPro.isDisplayed();
    		return textUi;
    		
    	}

		

	
}


