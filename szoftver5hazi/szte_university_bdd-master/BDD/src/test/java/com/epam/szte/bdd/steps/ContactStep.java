package com.epam.szte.bdd.steps;

import org.junit.Assert;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ContactPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactStep {
	
	private ContactPage contactPage = new ContactPage(Hooks.driver);
	
	@Then("^I can see the contuct us page$")
	public void theConatactPageIsVisible() {
		Assert.assertTrue("The Contact page is not displayed", contactPage.contactPageIsVisible());
	}
	
	@When("^I select \"([^\"]*)\" Subject Heading$")
	public void selectSubvjectHeaeding(String subject) {
		contactPage.selectSubjectHeading(subject);
	}
	
	@When("^I write email address \"([^\"]*)\"$")
	public void writeEmailAddress(String email) {
		contactPage.writeEmailAddress(email);
	}
	
	@When("^I write order reference \"([^\"]*)\"$")
	public void writeOrderReference(String order) {
		contactPage.writeOrderReference(order);
	}
	
	@When("^I write message \"([^\"]*)\"$")
	public void writeMessage(String message) {
		contactPage.writeMessage(message);
	}
	
	@Then("^I see my message is \"([^\"]*)\"$")
	public void checkMyMessage(String message) {
		Assert.assertEquals(message, contactPage.getMessage());
	}

}
