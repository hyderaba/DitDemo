package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination {

  @Given("^initialize the browrser$")
    public void initialize_the_browrser() throws Throwable {
        System.out.println("browser is open");
    }
  
  @When("^enter the page by login \"([^\"]*)\" and \"([^\"]*)\"$")
  public void enter_the_page_by_login_something_and_something(String strArg1, String strArg2) throws Throwable {
	  System.out.println(strArg1);
	  System.out.println(strArg2);
  }
  
//  @When("enter the page by login username and password")
//  public void enter_the_page_by_login_username_and_password() {
//      // Write code here that turns the phrase above into concrete actions
//	  System.out.println("enter thee credentiols");
//  }
    
    @Then("^logged in to page$")
    public void logged_in_to_page() throws Throwable {
    	   System.out.println("logged in");
       
    }
    @And("^displayed the message$")
    public void displayed_the_message() throws Throwable {
    	  System.out.println("message displayed");
    }
}