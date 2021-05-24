package com.w2a.rough;


import java.io.IOException;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.acounts.AccountsPage;
import com.w2a.pages.crm.acounts.CreateAccountPage;


public class LoginTest {

	public static void main(String[] args) throws IOException {
		
		HomePage home=new HomePage();
		LoginPage lp=home.goToSignIn();
		ZohoAppPage zp=lp.doLogin("geetudhillon@yahoo.com", "Infosys01+");
		zp.goToCRM();
		
		AccountsPage account=Page.menu.goToAccounts();
		CreateAccountPage cap= account.goToCreateAccount();
		cap.createAccount("Geetinder");

	}

}
