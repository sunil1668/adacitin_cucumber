package com.app.locator;

import org.openqa.selenium.By;

import com.app.base.BaseClass;

public class LoginPageLocator extends BaseClass
{
	public static By username = By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]");
	public static By pwd =  By.id("password");
	public static By login = By.name("login");
	

}
