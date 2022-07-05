package com.ecomm.genericPage;

import java.io.FileInputStream;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

	public static WebDriver driver;
	public Properties config;
	public Properties locat;
	
	//constructor
	public MasterPage() throws Exception
	{
	 //Configuration Of Property File
		FileInputStream con = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\ecomm\\repository\\configuration.properties");
		config = new Properties();
		config.load(con);
		
		FileInputStream l = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\ecomm\\repository\\locators.properties");
		locat = new Properties();
		locat.load(l);
		
		
		}
	
	
	
	
	}
	

