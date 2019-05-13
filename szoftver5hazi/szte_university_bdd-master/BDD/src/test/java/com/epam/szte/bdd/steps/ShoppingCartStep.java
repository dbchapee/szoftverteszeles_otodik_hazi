package com.epam.szte.bdd.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ShoppingCartPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ShoppingCartStep {

	private ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Hooks.driver);

	@Then("^I see the shopping cart page$")
	public void shoppingCartPageIsDisplayed() {
		Assert.assertTrue("The shopping cart page is not displayed", shoppingCartPage.shoppingCartIsDisplayed()); 
	}
	
	@Then("I see the added items")
	public void checkTheAddedItems(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		List<Product> actualProducts = shoppingCartPage.getProducts();
		List<Product> expectedProducts = new ArrayList<Product>();
		for(int i = 0; i < list.size(); i++) {
			Product product = new Product();
			product.setProductName(list.get(i).get("Description"));
			product.setUnitProductPrice(list.get(i).get("Unit price"));
			product.setTotalProductPrice(list.get(i).get("Total"));
			product.setProductQuantity(list.get(i).get("Qty"));
			expectedProducts.add(product);
		}
		assertThat(actualProducts.size(), equalTo(expectedProducts.size()));
		Iterator<Product> actualIterator = actualProducts.iterator();
		for (Product expectedProduct : expectedProducts) {
			assertThat("failed", actualIterator.next(), samePropertyValuesAs(expectedProduct));
		}
	}
	
	/**
	 * Órai Feladat
	 */
	
	private static String CART_IS_EMPTY = "cart is empty";
	
	@When("^I click on delete button$")
	public void clickOnDeleteButton() {
		shoppingCartPage.clicOndeleteButton();
	}
	
	@Then("^I can see the cart is empty$")
	public void checkEmptyCartAlert() {
		assertThat(shoppingCartPage.getAlertMessage(), containsString(CART_IS_EMPTY));
	}
	
}
