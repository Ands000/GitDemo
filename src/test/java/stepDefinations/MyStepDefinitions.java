package stepDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Cucumber.Automation.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;


//@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver=base.getDriver();
        
    }

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	h=new HomePage(driver);
        h.getSearch().sendKeys(strArg1);
      
        	Thread.sleep(3000);
        
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
      Assert.assertTrue( driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
	  
    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
    	Assert.assertTrue( driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        Thread.sleep(4000);
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	Thread.sleep(2000);
       
    }

}
