package automationexerise;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scrollwithoutarrow extends setup{

	@Test
	public static void scrollwithoutarrowkey() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        int scrollHeight = (int) (long) js.executeScript("return document.body.scrollHeight");

        // Scroll down in increments
        for (int i = 0; i < scrollHeight; i += 100) {
            js.executeScript("window.scrollBy(0, 100)");
            try {
                Thread.sleep(50); // Adjust the sleep time for smoother or faster scrolling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll up in increments
        for (int i = scrollHeight; i > 0; i -= 100) {
            js.executeScript("window.scrollBy(0, -100)");
            try {
                Thread.sleep(50); // Adjust the sleep time for smoother or faster scrolling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     
	}
}
