package muttonbitton;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 class bptest {
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		
		System.setProperty("webdriver.chrome.driver","F:\\java\\Jars & WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("main");
		login(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//add category method
		addcat(driver);
		
		//Add product Method
		Product.addproduct(driver);
	}
			
		//Backpanel Login
		public static void login(WebDriver driver)throws InterruptedException {
			driver.get("https://appat300.com/demo/#!/page/login");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			driver.get(driver.getCurrentUrl());

			WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail1")));
			name.sendKeys("admin@flowcomptech.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("reset@2020");
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button")).click();
			System.out.println("login successfull");
		   //driver.navigate().to("https://appat300.com/demo/#!/app/dashboard");
		}
		
			
		//Add Category method
		public static void addcat(WebDriver driver) throws InterruptedException {
			driver.navigate().to("https://appat300.com/demo/#!/app/dashboard");System.out.println("donee");
			Thread.sleep(9000);
			driver.findElement(By.name("cat")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("addcat")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div[1]/div/div[1]/div/input")).sendKeys("test_category");
			
			driver.findElement(By.name("IsLast")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> dd_islast = driver.findElements(By.xpath("//*[@id=\"ui-select-choices-row-1-1\"]/a/span"));
			 															
				for(WebElement element :dd_islast)
				{
					System.out.println("Values " + element.getAttribute("innerHTML"));
					//WebElement element= dd_islast.get(i);
					String innerhtml=element.getAttribute("innerHTML");
					System.out.println(innerhtml);
					if(innerhtml.contentEquals("false"))
					{
						element.click();
						break;
					}
				}
			driver.findElement(By.name("CType")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> cate_type = driver.findElements(By.xpath("//*[@id=\"ui-select-choices-row-3-2\"]/a/span"));
				 
				for(WebElement element :cate_type)
				{
					System.out.println("Values " + element.getAttribute("innerHTML"));
					//WebElement element= dd_islast.get(i);
					String innerhtml=element.getAttribute("innerHTML");
					System.out.println(innerhtml);
					if(innerhtml.contentEquals("Others Categories"))
					{
						element.click();
						break;
					}
				}
			System.out.println("abc");
			driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div[2]/div/button[1]")).click();
			//driver.findElement(By.xpath("//*[@id=\"tree-root\"]/ol/li[1]/div/a[1]")).click();
			//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/button[1]")).click();
			System.out.println("category added");
 		}
		public static void adduser(WebDriver driver)throws InterruptedException {
			System.out.println("add user");
			driver.navigate().to("https://appat300.com/demo/#!/app/users");
			Thread.sleep(4000);
			driver.findElement(By.id("adduser")).click();
			Select country=new Select(driver.findElement(By.xpath(" /html/body/div/aside/div/div/ul/li[11]/a/i[1] ")));
			
			country.selectByVisibleText(" PANEL USERS");System.out.println("don99ee");
			
			
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			WebElement side=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/div/ul/li[11]/a/text()")));
			side.click();System.out.println("donee");
			
	}
}
