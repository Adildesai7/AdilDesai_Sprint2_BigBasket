package com.pages;

import com.base.Base;

public class Login extends Base
{
	Base bs;
	
	public void browserSetup() {
		bs = new Base();
		bs.initialization();
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
}