package automationexerise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class login_register_beforecheckout extends setup {
	
	@Test
	public static void L_R_beforecheckout() {
		
		cart.addToCart();
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		//alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()=\"Register / Login\"]")));
	    driver.findElement(By.xpath("//u[text()=\"Register / Login\"]")).click();
	    
	    login.logged_in();
	    //register.signup();
	    
	    driver.findElement(By.xpath("//a[contains(@href,'/view_cart')]")).click();
	    
	     	    
	}
	
	
	

}
