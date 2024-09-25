package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class categories extends setup {
	
	@Test
	public static void catgy_woman() {
		
		driver.findElement(By.xpath("//a[@href=\"#Women\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"#Men\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"#Kids\"]")).click();
		
		driver.findElement(By.xpath("//a[@href=\"/category_products/3\"]")).click();
		
	}

}
