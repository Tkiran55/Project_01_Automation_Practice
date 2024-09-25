package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends setup{
	
	@Test
	public static void logged_in() {
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("tamang1@gmail.com");
		
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("tamang@123");
		
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		
		verify_login();
	}
		 
		public static void verify_login() {
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Automation Exercise")) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
		
	}
	

}
