package com.ecomm.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecomm.genericPage.MasterPage;

import com.ecomm.pages.LoginPage;

public class EcommTest {
	
	@BeforeClass
	public void OpenBrowser() throws Exception {
		LoginPage lp = new LoginPage();
		lp.launchBrowser();
	}
	@Test
	public void loginTest() throws Exception {
		LoginPage lp = new LoginPage();
		lp.openPage();
		lp.clickEmailOrPhone();
		lp.enterUserName();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void addcat() throws Exception {
		LoginPage lp = new LoginPage();
		lp.openCatPage();
		lp.openCat();
		lp.addCat();
		lp.addCatName();
	//	lp.IsLast();
	}
	
//	@AfterClass
	public static void closeLogiPage()
	{
		MasterPage.driver.close();
	}
	
}
