package automationexerise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class invoice_download extends setup {
	
	@Test
	public static void download_invoice() {
		CheckoutAndPayment.checkAndpay();
		
		driver.findElement(By.xpath("//a[@href='/download_invoice/500']")).click();
	}

}
