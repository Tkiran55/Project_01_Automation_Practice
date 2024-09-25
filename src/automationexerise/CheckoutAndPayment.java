package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckoutAndPayment extends setup{
	
	@Test
	public static void checkAndpay() {
		cart.addToCart();
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		verify_checkout();
		
		//place order
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		verify_payment();
		
		driver.findElement(By.name("name_on_card")).sendKeys("Kiran Tamang");
		driver.findElement(By.name("card_number")).sendKeys("123456789");
		driver.findElement(By.name("cvc")).sendKeys("123");
		driver.findElement(By.name("expiry_month")).sendKeys("12");
		driver.findElement(By.name("expiry_year")).sendKeys("2025");
		
		driver.findElement(By.xpath("//button[text()=\"Pay and Confirm Order\"]")).click();
	    verify_orderplaced();
	}
	
	public static void verify_checkout() {
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Automation Exercise - Checkout")) {
			System.out.println("You are in Checkout.");
		}else {
			System.out.println("You are not in Checkout.");
		}
	}
	
	
	public static void verify_payment() {
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Automation Exercise - Payment")) {
			System.out.println("You are in Payment.");
		}else {
			System.out.println("You are not in Payment.");
		}
	}
	
	public static void verify_orderplaced() {
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Automation Exercise - Order Placed")) {
			System.out.println("Order Success.");
		}else {
			System.out.println("Sorry, failed.");
		}
	}

}
