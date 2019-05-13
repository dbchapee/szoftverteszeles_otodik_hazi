package com.epam.szte.bdd.steps;

import org.junit.Assert;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.LoginPage;
import com.epam.szte.bdd.pages.RegisterPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep {

	
	private RegisterPage registerpage = new RegisterPage(Hooks.driver);
	
	@Then("^I can see the Register us page$")
	public void theregisterPageIsVisible() {
		Assert.assertTrue("The Register page is not displayed", registerpage.registerPageIsVisible());
	}
	
	@When("^I write \"([^\"]*)\" into email field$")
	public void writeEmailAdressIntoEmailField(String emailAddress) {
		registerpage.writeEmailAddress(emailAddress);
	}
	
	@Then("^I see my email is \"([^\"]*)\"$")
	public void checkemail(String s) {
		Assert.assertEquals(s, registerpage.getEmailAddress());
	}
	@When("^I click on create Button$")
	public void clickOnLoginButton() {
		registerpage.clickOnCreateButton();
	}
	@When("^I write \"([^\"]*)\" into FirstName field$")
	public void writefirstname(String s) {
		registerpage.writefirstname(s);
	}
	@Then("^I see my firstname is \"([^\"]*)\"$")
	public void checkfirstname(String s) {
		Assert.assertEquals(s, registerpage.getfirstname());
	}
	
	@When("^I write \"([^\"]*)\" into LastName field$")
	public void writelasttname(String s) {
		registerpage.writelastname(s);
	}
	@Then("^I see my lastname is \"([^\"]*)\"$")
	public void checklastname(String s) {
		Assert.assertEquals(s, registerpage.getlastname());
	}
	
	@When("^I write \"([^\"]*)\" into passwd field$")
	public void writePasswdIntoPasswordField(String password) {
		registerpage.writepw(password);
	}
	@Then("^I see my pw is \"([^\"]*)\"$")
	public void checkpw(String s) {
		Assert.assertEquals(s, registerpage.getpw());
	}
	
	@When("^I write \"([^\"]*)\" into Address FirstName field$")
	public void writeadressfirstname(String s) {
		registerpage.writeaddressfirstname(s);
	}
	@Then("^I see my Address Firstname is \"([^\"]*)\"$")
	public void checkadressfirstname(String s) {
		Assert.assertEquals(s, registerpage.getaddressfirstname());
	}
	
	@When("^I write \"([^\"]*)\" into Address LastName field$")
	public void writeaddresslasttname(String s) {
		registerpage.writeaddresslastname(s);
	}
	@Then("^I see my Address LastName is \"([^\"]*)\"$")
	public void checkadresslastname(String s) {
		Assert.assertEquals(s, registerpage.getaddresslastname());
	}
	@When("^I write \"([^\"]*)\" into Address field$")
	public void writeaddress(String s) {
		registerpage.writeaddress(s);
	}
	@Then("^I see my Address is \"([^\"]*)\"$")
	public void checkadress(String s) {
		Assert.assertEquals(s, registerpage.getaddress());
	}
	@When("^I write \"([^\"]*)\" into City field$")
	public void writecity(String s) {
		registerpage.writecity(s);
	}
	@Then("^I see my City is \"([^\"]*)\"$")
	public void checkcity(String s) {
		Assert.assertEquals(s, registerpage.getCity());
	}
	@When("^I write \"([^\"]*)\" into Zipcode field$")
	public void writezipcode(String s) {
		registerpage.writezipcode(s);
	}
	@Then("^I see my Zipcode is \"([^\"]*)\"$")
	public void checkzipcode(String s) {
		Assert.assertEquals(s, registerpage.getzipcode());
	}
	@When("^I write \"([^\"]*)\" into Phonenumber field$")
	public void writephone(String s) {
		registerpage.writephone(s);
	}
	@Then("^I see my Phonenumber is \"([^\"]*)\"$")
	public void checkphone(String s) {
		Assert.assertEquals(s, registerpage.getphone());
	}
	

}
