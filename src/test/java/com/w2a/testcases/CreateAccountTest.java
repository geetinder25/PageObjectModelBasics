package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.acounts.AccountsPage;
import com.w2a.pages.crm.acounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable <String,String> data) {
		ZohoAppPage zp=new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account=Page.menu.goToAccounts();
		CreateAccountPage cap= account.goToCreateAccount();
		cap.createAccount(data.get("accountName"));
		
		//Assert.fail("Create Account test failed");

	}

}
