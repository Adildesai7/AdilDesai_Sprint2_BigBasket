package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class Deals extends Base{
	
	public void user_clicks_deals_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"store-entry\"]/div[1]/div/div[6]/div/div/a/img")).click();
	}

	public void user_clicks_on_sort_button() 
	{
		driver.findElement(By.xpath("//*[@id=\"sel1\"]")).click();		
	}
	
	public void user_clicks_on_popularity_button() 
	{
		WebElement dropDown=driver.findElement(By.id("sel1"));
		Select dropDownSelect =new Select(dropDown);
		dropDownSelect.selectByVisibleText("Popularity");		
	}

	public void user_clicks_on_price_low_high_button()
	{
		WebElement dropDown  =(driver.findElement(By.id("sel1")));
		Select dropDownSelect =new Select(dropDown);
		dropDownSelect .selectByValue("string:pricelth");
	}

	public void user_clicks_on_alphabetically_button()
	{
		WebElement dropDown=driver.findElement(By.id("sel1"));
		Select dropDownSelect =new Select(dropDown);
		dropDownSelect.selectByVisibleText("Alphabetical");
	}
}