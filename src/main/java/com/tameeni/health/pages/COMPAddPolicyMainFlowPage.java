package com.tameeni.health.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class COMPAddPolicyMainFlowPage extends PageObject {

	public COMPAddPolicyMainFlowPage(WebDriver driver) 
	{
		super(driver);
	}
	// @FindBy(id = "btn_20805") 
	// static WebElement btnSelectPolicyholder;
	 @FindBy(xpath = "//*[@class=\"action-btn normal-action select-link\"]")
	 protected  static List<WebElement> btnSelectPolicyholder;
	 
	 @FindBy(xpath = "//div[@id='login-content']//div[@class='login-box']//div[@class='modal-body']")
	 protected  static List<WebElement> logintest;
	 
	 @FindBy(xpath = "//html//div[@id='wrapper']//div[1]/div[1]/div[2]/button[1]")
	 public static WebElement SelectAddress;
	// @FindBy(className="addressbox-button")
	// protected  static List<WebElement> SelectAddress;
	 
	 @FindBy(xpath = ".//*[@id='select-vehicle']/tbody/tr/td[@class='actions']/a")
	 protected  static List<WebElement> btnSelectVehicle;
	 
	 @FindBy(name = "PurposeofVehicleUseID")
	 public static WebElement VehicleID;
	 
	 @FindBy(name="RegionID")
	 public static WebElement Region;
	
	 @FindBy(name="VehicleDriveCityID")
	 public static WebElement City;
	 
	 @FindBy(name="Occupation")
	 public static WebElement SelectOccupation;
	 
	 @FindBy(name="CoverAgainstAdditionPremium")
	 public static WebElement Selectage;
	 
	 @FindBy(xpath="//*[@id=\"select2-CoverAgainstAdditionPremium-container\"]")
	 public static WebElement SelectAdditionPremium;
	 
	 @FindBy(id="txtPolicyEffectiveDate")
	 public static WebElement DatePicker;
	 
	@FindBy(xpath="//div[@class='datepicker-days']//table[contains(@class,'table-condensed')]//td[@class='active day']")
	protected  static WebElement selectdate;
	
	//WebElement dateWidget = selectdate;
	//protected static List<WebElement> columns;
	 
	 @FindBy(xpath="//span[@class='Form-label-text'][contains(text(),'According to rules for collecting insurance relate')]")
	 public static WebElement SelectDeclaration;
	 
	 @FindBy(id="btnNext")
	 public static WebElement NextOtherDetail;
	 
	 @FindBy(id="VehicleEstimatedValue")
	 public static WebElement EstimateValue;
	 
	 @FindBy(id="btnSave")
	 public static WebElement GetQuote;
	 
	 @FindBy(xpath ="//div[@class='extention-actionbox hidden-xs']//label[1]")
	 protected static List<WebElement> Feature1; 
	 
	// @FindBy(name="SelectedDeductibleAmount")
	@FindBy(xpath="//div[@class='detuctible-choice-box hidden-xs']//div[@class='form-row clearfix']//div[@class='input-box']//span[@class='select2 select2-container select2-container--default']//span[@class='selection']//span[@class='select2-selection select2-selection--single']")
	protected static List<WebElement> Deductible;
	
	@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--above']//li")
	protected static List<WebElement> DeductibleAmount;
	
	 @FindBy(name = "buttonType")
	 protected  static List<WebElement> btnNext;
	 
	 @FindBy(id = "btnSubmit")
	 public static WebElement PurchasedConti;
	 
	 @FindBy(xpath = "//*[@id=\"fuFront\"]")
	 public static WebElement FrontImage;
	 
	 @FindBy(id = "fuRear")
	 public static WebElement RearImage;
	 
	 @FindBy(id = "fuRight")
	 public static WebElement RightImage;
	 
	 @FindBy(id = "fuLeft")
	 public static WebElement LeftImage;
	 
	 @FindBy(id = "fuVIN")
	 public static WebElement VINImage;
	 
	 @FindBy(xpath = "//div[@class='declare']//div[@class='form-row']")
	 public static WebElement VehicleDeclaration;
	 
	 @FindBy(xpath = "//div[@id='image-holder-fuFront']")
	 public static WebElement VehiclefuFront;
	 
	 @FindBy(xpath = "//div[@class='col-sm-12 col-md-6 padding-right40']//label[2]/span[1]/span[1]")
	 public static WebElement person;
	 
	 @FindBy(xpath = "//div[@class='input-box custom-checkbox']//div[@class='Form-section']//label[@class='Form-label--tick']//span[@class='Form-label-text']")
	 public static WebElement ImagesTerms;
	 
	 @FindBy(xpath ="//html//div[@class='input-box iban-input hidden-xs']/input")
	 public  static List<WebElement> IBAN;
	 
	 
	 @FindBy(xpath = "//span[@class='radio-text'][contains(text(),'VISA')]")
	 public static WebElement VISA;
	
	 @FindBy(xpath = "//div[@id='agreement']//div[@class='Form-section']//label[@class='Form-label--tick']//span[contains(text(),'I accept the')]")
	// @FindBy(how = How.PARTIAL_LINK_TEXT, using = "I accept the" ) // ="//div[@class='input-box custom-checkbox']//div[@class='Form-section']//label[@class='Form-label--tick']//span[@class='Form-label-text']")
	public static WebElement AcceptTermsPay;
	//protected static List<WebElement> AcceptTermsPay;
	 
	 @FindBy(xpath = "//button[@id='next']")
	 public static WebElement PayNow;
	 @FindBy(xpath= "//span[contains(text(),'I accept the')]")
	 public static WebElement Iaccept;
	 
	 
	 
	 
	
}
