package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.acounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public void goToHome() {
		
	}
	
	public void goToLeads() {
		
	}
	
	public void goToContacts() {
		
	}
	
	public AccountsPage goToAccounts() {

		Page.click("accountsTab_CSS");
		return new AccountsPage();
	}
	
	public void goToDeals() {
		
	}
	
	public void goToActivities() {
		
	}
	
	public void goToReports() {
		
	}
	
	public void signOut() {
		
	}

}
