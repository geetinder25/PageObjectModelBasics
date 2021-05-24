package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMHomePage extends Page {
	
	public void verifyCRMLogo() {
		driver.findElement(By.cssSelector("img[alt='logo']")).getText();
	}
	
	public void verifyWelcomeText() {
		driver.findElement(By.cssSelector("span[id='show-uName']")).getText();
		
	}

}
