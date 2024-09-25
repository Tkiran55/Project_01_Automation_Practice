package automationexerise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class delete_user extends setup {
	
	@Test
	public static void delete_account() {
		
		login.logged_in();
		
		driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("b")));

		// Verify the text
		Assert.assertEquals(heading.getText(), "ACCOUNT DELETED!", "Not Matched");
		System.out.println("Delete Success");
	}
}
