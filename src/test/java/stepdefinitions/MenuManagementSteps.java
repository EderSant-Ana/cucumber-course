package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learning.cucumbercourse.RestaurantMenu;
import learning.cucumbercourse.RestaurantMenuItem;

public class MenuManagementSteps {

	RestaurantMenuItem newMenuItem;
	RestaurantMenu locationMenu = new RestaurantMenu();
	String errorMessage;
	
	public MenuManagementSteps(){
		System.out.println("Constructor called");
	}
	
	
	@Given("^I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)")
	public void i_have_a_menu_item_with_name_and_price(String menuItemName, String currencyType, Integer price) {
		newMenuItem = new RestaurantMenuItem(menuItemName, "Description new Item", price);
		System.out.println("Step 1");
	}

	@When("I add the menu item")
	public void i_add_the_menu_item() {
		try {
			locationMenu.addMenuItem(newMenuItem);			
		} catch (IllegalArgumentException e) {
			errorMessage = e.getMessage();
		}
		System.out.println("Step 2");

	}

	@Then("Menu Item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
		boolean exists = locationMenu.doesItemExist(newMenuItem);
		System.out.println("Step 3: " + exists);		
	}
	
	@Then("I should see an error message with value {string}")
	public void i_should_see_an_error_message_with_value(String string) {
		assertEquals("Duplicate Item", errorMessage);
	}

}
