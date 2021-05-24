package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page {

	public void goToCustomers() {

	}

	public void goToSupport() {
		click("supportLink_CSS");
	}

	public void goToContactSales() {

	}

	public LoginPage goToSignIn() throws IOException {
		
		click("loginLink_CSS");
		return new LoginPage();

	}

	public void goToFreeSignUp() {
		click("freeSignUpLink_CSS");
	}

	public void validateFooterLinks() {

	}


}
