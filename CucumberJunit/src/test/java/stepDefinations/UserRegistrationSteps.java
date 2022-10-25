package stepDefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigate on registration page");
	}

	@When("ueser enters following user details")
	public void ueser_enters_following_user_details(DataTable dataTable) {
		 // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		List<List<String>> userList = dataTable.asLists(String.class);
		for (List<String> e : userList) {
			System.out.println(e);
		}

	}
	
	@When("user enters following user details with row and column")
	public void user_enters_following_user_details_with_row_and_column(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
	   
		List<Map<String, String>> userList=dataTable.asMaps(String.class,String.class);  
		System.out.println(userList);
		System.out.println(userList.get(0).get("firstName"));	
		
		for (Map<String, String> e : userList) {
			System.out.println(e.get("firstName"));
			System.out.println(e.get("lastName"));
			System.out.println(e.get("eMail"));
			System.out.println(e.get("phoneNumber"));
			System.out.println(e.get("cityName"));
			
		}
	}


	@Then("user registration should be successful login")
	public void user_registration_should_be_successful_login() {

	}

}
