package com.ecomm.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ecomm.genericPage.MasterPage;
import com.ecomm.genericPage.TestUtill;

public class LoginPage extends TestUtill {

	//constructor of login page
	//with super() u can call parent constructor
	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void launchBrowser() {
		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\com.ecomm.driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\com.ecomm.driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Not Found the driver");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get(config.getProperty("URL"));
		
	}
	public void openPage() {
		getLink("loginURL");
	}
    public void clickEmailOrPhone() {
    	click("EmailOrPhone");
    }
    
    public void enterUserName() {
    	enterData("EmailOrPhone","testdata1");
    }
    
    public void clickPassword() {
    	click("Password");
    }
    
    public void enterPassword() {
    	enterData("Password", "testdata2");
    }
    
    public void clickLoginButton() {
    	click("loginbutton");
    }
    
    
    
    public void openCatPage() {
		navigateLink("DashboardURL");
	}
	
	public void openCat() {
		click("cat");
	}
	
	public void addCat() {
		click("addcat");
	}
	
	public void addCatName() {
		enterData("catName", "catNameData");
	}
	
	public void IsLast() {
		//click("IsLast");
		List<WebElement> islast =MasterPage.driver.findElements(By.xpath(locat.getProperty("IsLastOptions")));
		System.out.println(islast.size());
	}
    
}
