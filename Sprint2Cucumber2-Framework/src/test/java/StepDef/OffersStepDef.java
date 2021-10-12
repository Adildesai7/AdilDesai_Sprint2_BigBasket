package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pages.Offers;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OffersStepDef extends Offers
{

	Offers Of;
	
	@Given("User is in Home Page")
	public void user_is_in_home_page() 
	{
		Of = new Offers();
		Of.initialization();
	}
	    
	@When("User clicks on Offer button")
	public void user_clicks_on_offer_button() 
	{
		 Of.offerButton();
	}

	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() 
	{
		Of.cartButton();
	}		

	@When("User clicks on cart\\/basket button")
	public void user_clicks_on_cart_basket_button() 
	{
		 Of.cartBasketButton();
		 Of.teardown();
	}	

}