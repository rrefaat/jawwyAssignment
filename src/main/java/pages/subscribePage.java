package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class subscribePage extends PageBase {

	public subscribePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="country-btn")
	WebElement countriesBtn;
	
	@FindBy(id="ae")
	WebElement uae;
	
	@FindBy(id="lb")
	WebElement lebanon;
	
	@FindBy(id="ma")
	WebElement morocco;
	
	@FindBy(id="name-lite")
	WebElement litePackage;

	@FindBy(xpath = "//*[@id='currency-lite']/i")
	WebElement currencyLite;
	
	@FindBy(xpath = "//*[@id='currency-lite']/b")
	WebElement priceLite;
	
	@FindBy(id="name-classic")
	WebElement classicPackage;
	
	@FindBy(xpath = "//*[@id='currency-classic']/i")
	WebElement currencyclassic;
	
	@FindBy(xpath = "//*[@id='currency-classic']/b")
	WebElement priceclassic;
	
	@FindBy(id="name-premium")
	WebElement premiumPackage;
	
	@FindBy(xpath = "//*[@id='currency-premium']/i")
	WebElement currencypremium;
	
	@FindBy(xpath = "//*[@id='currency-premium']/b")
	WebElement pricepremium;

	public void openCountiesList() {
		countriesBtn.click();
	}
	
	public void navigateToUAEPlans() {
		openCountiesList();
		uae.click();
	}
	
	public void navigateToLebanonPlans() {
		openCountiesList();
		lebanon.click();
	}
	
	public void navigateToMoroccoPlans() {
		openCountiesList();
		morocco.click();
	}
	
	public void checkUAEPackages() {
		navigateToUAEPlans();
		Assert.assertTrue(currencyLite.getText().contains("USD/month"));
		Assert.assertTrue(priceLite.getText().contains("5.4"));
		
		Assert.assertTrue(currencyclassic.getText().contains("USD/month"));
		Assert.assertTrue(priceclassic.getText().contains("10.9"));
		
		Assert.assertTrue(currencypremium.getText().contains("USD/month"));
		Assert.assertTrue(pricepremium.getText().contains("16.3"));
	}
	
	public void checkLebanonPackages() {
		navigateToLebanonPlans();
		Assert.assertTrue(currencyLite.getText().contains("USD/month"));
		Assert.assertTrue(priceLite.getText().contains("2.4"));
		
		Assert.assertTrue(currencyclassic.getText().contains("USD/month"));
		Assert.assertTrue(priceclassic.getText().contains("4.8"));
		
		Assert.assertTrue(currencypremium.getText().contains("USD/month"));
		Assert.assertTrue(pricepremium.getText().contains("7.2"));
	}
	
	public void checkMoroccoPackages() {
		navigateToMoroccoPlans();
		Assert.assertTrue(currencyLite.getText().contains("USD/month"));
		Assert.assertTrue(priceLite.getText().contains("2"));
		
		Assert.assertTrue(currencyclassic.getText().contains("USD/month"));
		Assert.assertTrue(priceclassic.getText().contains("3.9"));
		
		Assert.assertTrue(currencypremium.getText().contains("USD/month"));
		Assert.assertTrue(pricepremium.getText().contains("5.8"));
	}
	
	
	
	
	

}
