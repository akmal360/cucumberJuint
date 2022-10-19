package stepDefinations;

import amazonProducts.Product;
import amazonProducts.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I want to write a step with search on Amazon page")
	public void i_want_to_write_a_step_with_search_on_amazon_page() {
		System.out.println("Step 1: Launching URL");

	}

	@When("I search for product with {string} and price is {int}")
	public void i_search_for_product_with_and_price_is(String prodectName, Integer price) {
		System.out.println("Step 2: ProductName: " + prodectName + "Price" + price);

		product = new Product(prodectName, price);
	}

	@Then("product with name {string} should displayed")
	public void product_with_name_should_displayed(String prodectName) {
		System.out.println("Step 3: ProductName:" + prodectName);

		search = new Search();
		String nameProduct = search.displayProduct(product);
		System.out.println("Searched product name" + nameProduct);

	}

	@Then("Order is is {int} and user name is {string}")
	public void order_is_is_and_user_name_is(Integer int1, String string) {

	}

}
