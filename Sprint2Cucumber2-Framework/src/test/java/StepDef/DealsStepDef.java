package StepDef;

import com.pages.Deals;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsStepDef 
{
	Deals dp;
	
	@Given("User is in home page")
	public void user_is_in_home_page() 
	{
		dp = new Deals();
		dp.initialization();
	}

	@When("User clicks on Deals button")
	public void user_clicks_on_deals_button() 
	{
		dp.user_clicks_deals_button();
	}

	@When("User clicks on Sort button")
	public void user_clicks_on_Sort_button() 
	{
	    dp.user_clicks_on_sort_button();
	}

	@Then("User clicks on Popularity button")
	public void user_clicks_on_popularity_button() throws InterruptedException 
	{
		dp.user_clicks_on_popularity_button();
		Thread.sleep(5000);
		dp.teardown();
	}

	@Then("User clicks on Price\\(low-high) button")
	public void user_clicks_on_price_low_high_button() throws InterruptedException 
	{
		dp.user_clicks_on_price_low_high_button();
		Thread.sleep(5000);
		dp.teardown();
	}

	@Then("User clicks on Alphabetically button")
	public void user_clicks_on_alphabetically_button() throws InterruptedException 
	{
		dp.user_clicks_on_alphabetically_button();
		Thread.sleep(5000);
		dp.teardown();
	}
	
}