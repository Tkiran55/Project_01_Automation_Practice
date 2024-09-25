package automationexerise;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class register extends setup{
	
	@Test
	public static void signup() {
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("Kiran Tamang");
		
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("tamang1@gmail.com");
		
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		enter_details();
		verify_signup();
	}
	
	public static void enter_details() {
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("tamang@123");
		
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByIndex(14);
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByIndex(5);
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByIndex(22);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Kiran");
		driver.findElement(By.id("last_name")).sendKeys("Tamang");
		driver.findElement(By.id("company")).sendKeys("KiranCompany");
		driver.findElement(By.id("address1")).sendKeys("India");
		driver.findElement(By.id("address2")).sendKeys("Dheli");
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(0);
		
		driver.findElement(By.id("state")).sendKeys("Dheli");
		driver.findElement(By.id("city")).sendKeys("Dheli");
		driver.findElement(By.id("zipcode")).sendKeys("12345");
		driver.findElement(By.id("mobile_number")).sendKeys("0987654321");
		driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
		
		
	}
		
		
		public static void verify_signup() {
		String acutal_title = driver.getTitle();
		
		if(acutal_title.equals("Automation Exercise - Account Created")) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		
	}
	

}
