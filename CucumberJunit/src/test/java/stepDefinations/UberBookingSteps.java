package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wnats to select a car type {string} from uber app")
	public void user_wnats_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("Step 1" + carType);
	}

	@When("User select car {string} and pick up point {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickUp, String dropDown) {
		System.out.println("Step 2:: " + carType + " " + pickUp + " " + dropDown);
	} 

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3: Is following ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4: Is following");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5:" +" The price is :"+ price);

	}
}
