package com.ecomm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ecomm.genericPage.MasterPage;
import com.ecomm.genericPage.TestUtill;

public class AddCategory extends TestUtill {

	public AddCategory() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void openPage() {
		getLink("DashboardURL");
	}
	
	public void openCat() {
		click("cat");
	}
	
	public void addCat() {
		enterData("addcat", "catNameData");
	}
	
	public void IsLast() {
		click("IsLast");
		List<WebElement> islast =MasterPage.driver.findElements(By.xpath(locat.getProperty("IsLastOptions")));
		System.out.println(islast.size());
	}
}
