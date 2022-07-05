package muttonbitton;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Product {
	
	@Test
	public static void addproduct(WebDriver driver) throws InterruptedException {
		//bptest.main(null);
		System.out.println("-------------------Add Product--------------------");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("https://appat300.com/demo/#!/app/products");
		driver.get(driver.getCurrentUrl());
	//Add product
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.name("addproduct")).click();
	//select category
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"category\"]/div[1]/span")).click();
		System.out.println("Product Category selected");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(60000);
		List<WebElement> cat = driver.findElements(By.xpath("//*[@id=\"ui-select-choices-row-0-2\"]/a/div"));
		for(WebElement element :cat)
		{
			System.out.println("Values " + element.getAttribute("innerHTML"));
			//WebElement element= dd_islast.get(i);
			String innerhtml=element.getAttribute("innerHTML");
			System.out.println(innerhtml);
			if(innerhtml.contentEquals("BAR SOAP"))
			{
				element.click();
				break;
			}
		}
		System.out.println("Category added");
		//add product name
		driver.findElement(By.name("Name")).sendKeys("Test_product");
		System.out.println("product name added");
		//add product status
		driver.findElement(By.xpath("//*[@id=\"status\"]/div[1]/span")).click(); 
		System.out.println("status drop down selected");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		List<WebElement> status = driver.findElements(By.xpath("//*[@id=\"ui-select-choices-row-1-0\"]/a/span"));
		for(WebElement element :status)
		{
			System.out.println("Values " + element.getAttribute("innerHTML"));
			//WebElement element= dd_islast.get(i);
			String innerhtml=element.getAttribute("innerHTML");
			System.out.println(innerhtml);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(innerhtml.contentEquals("Active"))
			{
				element.click();
				break;
			}
		}
		System.out.println("product status added");
		
		//add product option name
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("Name_0")).sendKeys("product_optName");System.out.println("opt name added");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//add product Quantity
		driver.findElement(By.name("Qnty")).sendKeys("100");System.out.println("product quantity added");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//add product weight
		driver.findElement(By.name("Weight")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> weight = driver.findElements(By.xpath("//*[@id=\"Weight\"]"));
			for(WebElement element :weight)
			{
				System.out.println("Values " + element.getAttribute("innerHTML"));
				//WebElement element= dd_islast.get(i);
				String innerhtml=element.getAttribute("innerHTML");
				System.out.println(innerhtml);
				if(innerhtml.contentEquals("packet"))
				{
					element.click();
					break;
				}
			}
			System.out.println("weight added");
			
			//add product group
		driver.findElement(By.name("GroupName")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> group = driver.findElements(By.xpath("//*[@id=\"GroupName\"]"));
			for(WebElement element :group)
			{
				String innerhtml=element.getAttribute("innerHTML");
				System.out.println(innerhtml);
				if(innerhtml.contentEquals("Pcs"))
				{
					element.click();
					break;
				}
			}
			System.out.println("group name added"); 
			
			//add product price
			driver.findElement(By.name("Price_0")).sendKeys("100");System.out.println("price added");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//add product stock
			driver.findElement(By.name("Stock_0")).sendKeys("100");System.out.println("stock added");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//apply product discount
			driver.findElement(By.name("DiscApply")).click();System.out.println("discount applied");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//add product Discount amt
			driver.findElement(By.name("Discount")).sendKeys("10");System.out.println("Disount amt added");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.name("addimg")).click();
			
			//add product Description
			driver.findElement(By.name("Description")).sendKeys("test_product_Description test_product_Description");
			driver.findElement(By.name("Keysearch")).sendKeys("test");

			//save product
			driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div[9]/button[1]")).click();
			
			
		    System.out.println("donee product added");
		}
		
	}
	

