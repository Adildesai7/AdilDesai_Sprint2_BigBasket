package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.Base;

public class Offers extends Base
{
	
	Base bs;
	
	public void browserSetup() 
	{
		bs = new Base();
		bs.initialization();
	}
			
	public void offerButton() {
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a/span")).click();
	}
	
	public void cartButton() {
		driver.findElement(By.xpath("//*[@id=\"dynamicDirective\"]/product-deck/section/div[2]/div[4]/div[1]/div/div/div[2]/div/div[7]/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
	}
	
	public void cartBasketButton() {
		driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/bigbasket-cart-template/div/div[1]/div/div/a")).click();
	}
}