package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Craterpage;
import utilites.BrowserUtils;
import utilites.DataReader;
import utilites.Driver;

public class userManagementSteps {
	
	Craterpage page = new Craterpage ();
	BrowserUtils utils = new BrowserUtils();
	
	@Given("As an enrity user, I am logged in")
	public void as_an_enrity_user_i_am_logged_in() throws InterruptedException {
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
		utils.actionsSendKeys(page.emailField, DataReader.getProperty("username"));
		utils.actionsSendKeys(page.passwordField, DataReader.getProperty("password"));
		Thread.sleep(1000);
		page.loginBtn.click();
		
	}
	@Given("I navigate to Items tab")
	public void i_navigate_to_items_tab() throws InterruptedException {
		page.itemsTab.click();
		Thread.sleep(1000);

	}
	@When("I click on the Add Item button")
	public void i_click_on_the_add_item_button() throws InterruptedException {
		page.addItemBtn.click();
		Thread.sleep(1000);
	}
	@When("I should be on item input page")
	public void i_should_be_on_item_input_page() {
		Assert.assertTrue(page.onItemPage.isDisplayed());
	}
	@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
	public void i_provide_item_information_name_price_unit_and_description(String Name, String price, String unit, String description) throws InterruptedException {
		page.name.sendKeys("Name");
		Thread.sleep(1000);
		page.price.sendKeys("18.00");
		Thread.sleep(1000);
		page.unit.click();
		Thread.sleep(1000);
		page.unitBox.click();
		Thread.sleep(1000);
		page.description.sendKeys("description");
		Thread.sleep(1000);
		
	}
	@When("I click Save Item button")
	public void i_click_save_item_button() throws InterruptedException {
		Thread.sleep(1000);

	}
	@Then("The Item is added to the Item list table")
	public void the_item_is_added_to_the_item_list_table() throws InterruptedException {
		page.saveBtn.click();
		Thread.sleep(1000);
	}
	
	@When("I select the item {string}")
	public void i_select_the_item(String Name) throws InterruptedException {
		page.nameitemselected.click();
		Thread.sleep(1000);
	}
	@When("I should be on item details page")
	public void i_should_be_on_item_details_page() throws InterruptedException {
		Assert.assertTrue(page.editItemPage.isDisplayed());
		Thread.sleep(1000);
	}
	@When("I update the item price to {int} dollars")
	public void i_update_the_item_price_to_dollars(Integer int1) throws InterruptedException {
		page.price.sendKeys(Keys.CONTROL + "a");
		page.price.sendKeys(Keys.DELETE);
		page.price.sendKeys("30.00");
	//	utils.actionsSendKeys(page.price, DataReader.getProperty("30.00"));
		Thread.sleep(1000);
	}
	@When("I click Update Item button")
	public void i_click_update_item_button() throws InterruptedException {
		page.updateItemBtn.click();
		Thread.sleep(1000);
	}
	@Then("the Item price is updated to {int} dollars")
	public void the_item_price_is_updated_to_dollars(Integer int1) throws InterruptedException {
		Assert.assertTrue(page.price.getText().equals("30.00"));
		Thread.sleep(1000);
	}

}
