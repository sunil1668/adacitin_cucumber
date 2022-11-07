package org.app.StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.app.base.BaseClass;
import com.app.execution.LoginPageExecution;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExecution
{
	@Given("Enter the URL")
	public void enter_the_url() throws IOException {
	    BaseClass.brwoserlaunch();
	     BaseClass.url(BaseClass.properties("link"));
	}
	@When("Enter the Username {string}")
	public void enter_the_username(String user) 
	{
		LoginPageExecution.username(user);
	 }
	@When("Enter the password {string}")
	public void enter_the_password(String pwd)
	{
		password(pwd);
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    
		button();
	}
	@Then("Validate the Home page title")
	public void validate_the_home_page_title() {
	   System.out.println("hi");
	}

	@When("Enter the user {string}")
	public void enter_the_user(String user) 
	{
	 username(user);    
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String password) 
	{
		password(password);
		//BaseClass.sendkeys(BaseClass.findwebelement(LoginPageLocator.pwd),password);
	}
	

	@Given("Enter the link of the website")
	public void enter_the_link_of_the_website() throws IOException 
	{
		 BaseClass.brwoserlaunch();
	     BaseClass.url(BaseClass.properties("link"));
	}
	@When("Enter the User")
	public void enter_the_user(DataTable dataTable) 
	{
	    
	List<String> li=	dataTable.asList();
	username(li.get(0));  
	}
	@When("Enter the User for aslist")
	public void enter_the_user_for_aslist(DataTable dataTable) 
	{
	List<List<String>> li =dataTable.asLists();
	System.out.println(li.get(0).get(1));
	}
	@When("Enter the User for asmap")
	public void enter_the_user_for_asmap(DataTable dataTable) 
	{
	Map<String,String> li =dataTable.asMap();
	System.out.println(li.get("sunil"));
	}
	
	@When("Enter the User for asmaps")
	public void enter_the_user_for_asmaps(DataTable dataTable) 
	{
	List<Map<String,String>> li =dataTable.asMaps();
	System.out.println(li.get(0).get("firstname"));
	}
}
