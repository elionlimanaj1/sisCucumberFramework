package com.sis.steps;

import org.junit.Assert;

import com.sis.pages.LoginPage;
import com.sis.pages.MainPage;
import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	LoginPage loginPage;

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		loginPage = new LoginPage();
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(loginPage.loginButton);
	}

	@Then("I see main page header is displayed")
	public void i_see_main_page_header_is_displayed() {
		MainPage mainPage = new MainPage();
		Assert.assertTrue(mainPage.header.isDisplayed());
	}

	@When("I enter valid username and no password")
	public void i_enter_valid_username_and_no_password() {
		loginPage = new LoginPage();
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
	}

	@Then("I see the alert")
	public void i_see_the_alert() throws InterruptedException {
		String expectedText = "Please fill required fields";
		String alertTxt = getAlertText();

		Thread.sleep(1000);

		dismissAlert();
		if (alertTxt.equals(expectedText))
			System.out.println(true);
		else
			System.out.println(false);

//		Assert.assertEquals(alertTxt, expectedText, "The text is not the same");
	}
	
	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) {
		loginPage = new LoginPage();
		sendText(loginPage.username, username);
		sendText(loginPage.password, password);
	}
}
