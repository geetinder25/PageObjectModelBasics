package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LoginPage extends Page {


	public ZohoAppPage doLogin(String username, String password) {
		
		/*driver.findElement(By.cssSelector("input[id='login_id']")).sendKeys(username);
		driver.findElement(By.cssSelector("button[id='nextbtn']>span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[id='nextbtn']>span:nth-child(1)")).click(); */
		
		type("email_CSS",username);
		click("nextBtn_CSS");
		type("password_CSS",password);
		click("signInBtn_CSS");
		
		return new ZohoAppPage();
		
	}
}
