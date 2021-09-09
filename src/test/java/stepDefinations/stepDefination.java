package stepDefinations;

import java.util.List;

import Cucumber.Automation.base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination extends base {

	@Given("^Validated the browser$")
    public void validated_the_browser() throws Throwable {
		System.out.println("Browser validated");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Triggered");
    }
    
    

    @Then("^Check browser is started$")
    public void check_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }
	
	@Given("^User is on Netbanking landing page$")
	public void User_is_on_Netbanking_landing_page()
	{
		System.out.println("User is on netbanking page");
		
	}
	 @When("^User login into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_the_application_with_something_and_password_something(String strArg1, String strArg2) {
	        System.out.println(strArg1);
	        System.out.println(strArg2);    
	    }

	
	@Then("^Homepage is polpulated$")
	public void Homepage_is_polpulated()
	{
		System.out.println("User is on page");
	}
	
	@And("^Title is displayed \"([^\"]*)\"$")
    public void title_is_displayed_something(String Arg1) throws Throwable {
		 System.out.println(Arg1);
    }
	
	 @And("^User have to signup with following details$")
	    public void user_have_to_signup_with_following_details(DataTable Data) throws Throwable {
	      List<List<String>> obj = Data.asLists();
	      System.out.println(obj.get(0).get(0));
	      System.out.println(obj.get(0).get(1));
	      System.out.println(obj.get(0).get(2));
	      System.out.println(obj.get(0).get(3));
	      
	    }

	 @When("^User login in to the application with (.+) and password (.+)$")
	    public void user_login_in_to_the_application_with_and_password(String username, String password) throws Throwable {
		 System.out.println(username);
		 System.out.println(password);
	        
	    }
	
	}

