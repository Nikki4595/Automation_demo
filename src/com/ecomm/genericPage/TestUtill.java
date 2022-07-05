package com.ecomm.genericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestUtill extends MasterPage {
	
   
	public TestUtill() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void getLink(String XpathKey) {
		driver.get(config.getProperty(XpathKey));
	}
	
	public void navigateLink(String XpathKey) {
		driver.navigate().to(config.getProperty(XpathKey));
	}
	
	public void click(String xpathKey) {
		driver.findElement(By.xpath(locat.getProperty(xpathKey))).click();
	}
    public void enterData(String xpathKey,String testData) {
    	driver.findElement(By.xpath(locat.getProperty(xpathKey))).sendKeys(locat.getProperty(testData));
	}
    public void clearData(String xpathKey) {
    	driver.findElement(By.xpath(locat.getProperty(xpathKey))).clear();
	}
    public void moveToElement(String xpathKey) {
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(locat.getProperty(xpathKey)))).build().perform();
		
	}
    public void clickListElement(String xpathKey, String  testData) {
		List<WebElement>radio =driver.findElements(By.xpath(locat.getProperty(xpathKey)));
		for(int i=0; i > radio.size(); i++) {
			if(radio.get(i).getText().equalsIgnoreCase(locat.getProperty(xpathKey)));
			radio.get(i).click();
		}
		
	}
	

}
