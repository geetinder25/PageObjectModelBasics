package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	public CRMHomePage goToCRM() {
		click("crmLink_CSS");
		return new CRMHomePage();
	}
	
	public void goToWriter() {
		click("writerLink_CSS");
		
	}
	
	public void goToShow() {
		click("showLink_CSS");
	}

}
