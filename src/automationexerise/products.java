package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class products extends setup{
	
	@Test
	public static void product_page() {
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		verify_product_page();
	}
	
	@Test
	public static void search_product() {
		driver.findElement(By.id("search_product")).sendKeys("Dress");
		driver.findElement(By.id("submit_search")).click();
	}
	
	@Test
	public static void view_product_details() {
		driver.findElement(By.xpath("//a[@href=\"/product_details/3\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href=\"/product_details/16\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href=\"/product_details/20\"]")).click();
	}
	
	public static void verify_product_page() {
		String page = driver.getTitle();
		
		if(page.equals("Automation Exercise - All Products")) {
			System.out.println("You are in product page");
		}else {
			System.out.println("You are not in product page");
		}
		
	}

}
