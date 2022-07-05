package com.ecomm.tests;

import org.testng.annotations.Test;

import com.ecomm.pages.AddCategory;

public class AddCategoryTest {
	
	@Test(dependsOnMethods = "loginTest")
	public void addcat() throws Exception {
		AddCategory ad= new AddCategory();
		ad.openPage();
		ad.openCat();
		ad.addCat();
		ad.IsLast();
	}

}
