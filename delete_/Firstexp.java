package muttonbitton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstexp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\java\\Jars & WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		signup(driver);
		//regis(driver);
	}

	public static void signup(WebDriver driver) throws InterruptedException {
	//	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost/ecomm/#!/app/h");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		name.click();
		driver.findElement(By.name("username")).sendKeys("nikitatestfcs@gmail.com");
		driver.findElement(By.name("password")).sendKeys("n");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("close")).click();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("add")).click();
		driver.quit();
	//	driver.findElement(By.name("MobileNo")).sendKeys("1234560890");
	//	driver.findElement(By.name("Email")).sendKeys("nikitap@flwocomptech.com");
	//	driver.findElement(By.name("Password")).sendKeys("n");
	//	driver.findElement(By.name("CnfrmPassword")).sendKeys("n");
	//	driver.findElement(By.className("btn btn-block btn-success mt-lg")).click();
		// TODO Auto-generated method stub
		
	}

	
/*	public static void regis(WebDriver driver) {
		
		// TODO Auto-generated method stub
		driver.get("https://appat300.com/demo/");
		driver.findElement(By.className("fa fa-user-circle")).click();
		
	}*/

}
