package automationexerise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class cart extends setup {
	
	@Test
	public static void addToCart() {
		//login.logged_in();
		products.product_page();
		view_cart();
	}
	
	public static void view_cart() {
		
		//scroll
		WebElement l=driver.findElement(By.xpath("//h2[text()=\"All Products\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
		
		//add product to cart
		driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();
		driver.findElement(By.cssSelector(".btn.btn-default.cart")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href=\"/product_details/11\"]")).click();
		driver.findElement(By.cssSelector(".btn.btn-default.cart")).click();
		
		System.out.println("Product viewed and added to cart.");
		
		//alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='View Cart']")));
	    driver.findElement(By.xpath("//u[text()='View Cart']")).click();
	    
	    //remove product from cart
	    driver.findElement(By.xpath("(//a[@class=\"cart_quantity_delete\"])[2]")).click();
	    
	    
	}

}
