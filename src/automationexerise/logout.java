package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logout extends setup {
	@Test
	public static void logged_out() throws InterruptedException {
		
		login.logged_in();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		System.out.println("Logout Success");
	}

}
