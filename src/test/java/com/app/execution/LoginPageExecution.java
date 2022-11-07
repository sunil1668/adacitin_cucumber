package com.app.execution;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocator;

public class LoginPageExecution extends LoginPageLocator
{

	public static void username(String uname) 
	{
		
	 BaseClass.sendkeys(BaseClass.findwebelement(LoginPageLocator.username), uname);
		
	}
	public static void password(String pwd)
	{
	BaseClass.sendkeys(BaseClass.findwebelement(LoginPageLocator.pwd),pwd);
	
	}

	public static void button()
	{
		BaseClass.click(BaseClass.findwebelement(LoginPageLocator.login));
    }
}
