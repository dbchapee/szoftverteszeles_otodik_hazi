package com.epam.szte.bdd.steps;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.SearchResultsPage;

import cucumber.api.java.en.Then;

public class SearchResultStep {
	
	private SearchResultsPage searchResultsPage = new SearchResultsPage(Hooks.driver);
	
	private static final String SEARCH = "SEARCH";
	
	@Then("^I see the page redirected to the search result page$")
	public void searchResultPageisDisplayed() {
		Assert.assertThat(searchResultsPage.getSearchResultHeader(), is(containsString(SEARCH)));
	}

}
