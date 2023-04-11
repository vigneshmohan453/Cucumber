package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbPositiveNegative extends BaseClass {
	
	@Given("To launch the chrome browser and maximise the window")
	public void to_launch_the_chrome_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username  in {string} email field")
	public void to_pass_valid_username_in_email_field(String user) {
	    WebElement username = driver.findElement(By.id("email"));
	    passtext(user, username);
	}

	@When("To pass invalid password in {string} password field")
	public void to_pass_invalid_password_in_password_field(String pass) {
		WebElement password = driver.findElement(By.id("pass"));
	    passtext(pass, password);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		clickBtn(login);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    closeEntireBrowser();
	}

}
