package com.tameeni.health.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class COMPHomePage extends PageObject {
	
    public COMPHomePage(WebDriver driver)
    {
		super(driver);
	}
    
    @FindBy(xpath = "//*[@id=\"header-section\"]/div[1]/div/div[3]/div/ul/li[3]/a") 
    public static  WebElement Language;
	
	@FindBy(xpath = "//*[@id=\"header-section\"]/div[1]/div/div[3]/div/ul/li[2]/a")
	public static WebElement LoginLink;
    
    @FindBy(xpath = "//*[@id=\"login-email\"]")
    public static WebElement txtEmail;
    
    @FindBy(xpath = "//*[@id=\"login-password\"]")
    public static WebElement txtpassword;
    
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    public static WebElement btnLogin;
/*
	@FindBy(id = "StrategyID") 
    private WebElement strategies;
	
	@FindBy(id = "CountryID")
	private WebElement countries;
    
    @FindBy(id = "NextStrategy")
    private WebElement nextStrategyButton;
    
    @FindBy(id = "NextCountry")
    private WebElement nextCountryButton;
    
    @FindBy(id = "btnCountryBack")
    private WebElement backCountryButton;

    @FindBy(id = "HealthInsuranceTypeId") 
    private WebElement healthInsuranceTypes;
    
    @FindBy(id = "InsuranceTypeCountryID")
    private WebElement insuranceTypeCountries;
    
    @FindBy(id = "NextApplication")
    private WebElement insuranceTypeNextButton;
    
    @FindBy(id = "txtNumberOfEmployees")
    private WebElement numberOfEmployeeTxtBox;
    
    @FindBy(id = "ClaimHistroyID")
    private WebElement claimHistoryDropDown;
    
    @FindBy(id = "NextExperience")
    private WebElement nextExperienceButton;

    
    public void selectStrategyByText(String stratagy) {
    	Select dropdown = new Select(strategies);
    	dropdown.selectByVisibleText(stratagy);
    }
    
    public void selectStrategyByIndex(int index) {
    	Select dropdown = new Select(strategies);
    	dropdown.selectByIndex(index);
    }
    
    public void selectCountryByText(String stratagy) {
    	Select dropdown = new Select(countries);
    	dropdown.selectByVisibleText(stratagy);
    }
    
    public void selectCountryByIndex(int index) {
    	Select dropdown = new Select(countries);
    	dropdown.selectByIndex(index);
    }
    
    public void selectHealthInsuranceTypeByText(String healthInsuranceType) {
    	Select dropdown = new Select(healthInsuranceTypes);
    	dropdown.selectByVisibleText(healthInsuranceType);
    }
    
    public void selectInsuranceTypeCountryByText(String insuranceTypeCountry) {
    	Select dropdown = new Select(insuranceTypeCountries);
    	dropdown.selectByVisibleText(insuranceTypeCountry);
    }
    
    public void clickNextStrategyButton() {
    	nextStrategyButton.click();
    }
    
    public void clickNextCountryButton() {
    	nextCountryButton.click();
    }
    
    public void clickInsuranceTypeNextButton() {
    	insuranceTypeNextButton.click();
    }
    
    public void typeNumberOfEmployee(String numberOfEmployee) {
    	numberOfEmployeeTxtBox.sendKeys(numberOfEmployee);
    }
    
    public void selectClaimHisostryByText(String claimHistory) {
    	Select dropdown = new Select(claimHistoryDropDown);
    	dropdown.selectByVisibleText(claimHistory);
    }
    
	
	public COMPHomeAction clickOnNextExpButton() {
		nextExperienceButton.click();
		return new COMPHomeAction(driver);
	}
    
	public boolean isInitialized() {
		return strategies.isDisplayed();
	}
*/
    
}
