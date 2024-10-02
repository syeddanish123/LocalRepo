package Bank;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefpratice 
{
    @Before
	public void Beforewala() {

		System.out.println("Beforewala");
	}
    
    @After
    public void Afterwala() {

		System.out.println("Afterwala");
	}
	
	@Given("^user on login page$")
	public void useronloginpage() {

		System.out.println("User on login page");
	}

	@And("^further$")
	public void further() {
		
		System.out.println("further steps");
		
	}
	
	@When("^successfull login to application$")
	public void successfull_login_to_application() {

		System.out.println("successfull login to application");

	}
	@When("^logout from application$")
	public void logout_from_application() {

		System.out.println("logout from application");

	}
	@Then("^closed application$")
	public void closed_application() {

		System.out.println("closed application");

	}


}
