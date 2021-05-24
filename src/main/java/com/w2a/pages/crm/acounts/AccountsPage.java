package com.w2a.pages.crm.acounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccount() {
		click("createAccountBtn_CSS");
		return new CreateAccountPage();
	}
	
	public void goToImportAccounts() {
		
	}

}
