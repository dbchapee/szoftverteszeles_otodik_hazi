package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

public class RegisterPage extends PageObject {
private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	
	}

	
	@FindBy(css="#emailcreate")
	private WebElement eMailTextField;
	

	@FindBy(id="SubmitCreate")
	private WebElement createButton;
	
	@FindBy(id="submitAccount")
	private WebElement submitButton;
	
	@FindBy(id="customer_firstname")
	private WebElement firstnametext;
	
	@FindBy(id="customer_lastname")
	private WebElement lastnametext;
	
	@FindBy(id="passwd")
	private WebElement pw;
	
	
	@FindBy(id="firstname")
	private WebElement address_firstname;
	
	@FindBy(id="lastname")
	private WebElement address_lastname;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	
	@FindBy(id="postcode")
	private WebElement postcode;
	
	@FindBy(id="phone_mobile")
	private WebElement phonemobile;
	
	public boolean registerPageIsVisible() {
		return createButton.isDisplayed();
	}
	public void writeEmailAddress(String emailAddress) {
		eMailTextField.sendKeys(emailAddress);
	}
	public String getEmailAddress() {
		return eMailTextField.getAttribute("value");
	}

	public void writefirstname(String s) {
		firstnametext.sendKeys(s);
	}
	public String getfirstname() {
		return firstnametext.getAttribute("value");
	}
	public void writelastname(String s) {
		lastnametext.sendKeys(s);
	}
	public String getlastname() {
		return lastnametext.getAttribute("value");
	}
	public void writepw(String s) {
		pw.sendKeys(s);
	}
	public String getpw() {
		return pw.getAttribute("value");
	}
	public void writeaddressfirstname(String s) {
		address_firstname.sendKeys(s);
	}
	public String getaddressfirstname() {
		return address_firstname.getAttribute("value");
	}
	public void writeaddresslastname(String s) {
		address_lastname.sendKeys(s);
	}
	public String getaddresslastname() {
		return address_lastname.getAttribute("value");
	}
	public void writeaddress(String s) {
		address.sendKeys(s);
	}
	public String getaddress() {
		return address.getAttribute("value");
	}
	public void writecity(String s) {
		city.sendKeys(s);
	}
	public String getCity() {
		return city.getAttribute("value");
	}
	
	public void writezipcode(String s) {
		postcode.sendKeys(s);
	}
	
	public String getzipcode() {
		return postcode.getAttribute("value");
	}
	public void writephone(String s) {
		phonemobile.sendKeys(s);
	}
	public String getphone() {
		return phonemobile.getAttribute("value");
	}
	public void clickOnCreateButton() {
		createButton.click();
	}
}

