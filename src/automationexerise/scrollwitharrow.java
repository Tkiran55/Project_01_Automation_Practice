package automationexerise;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scrollwitharrow extends setup{

	@Test
	public static void scrollwitharrowkey() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down using the DOWN arrow key
        for (int i = 0; i < 30; i++) { // Adjust the loop count to scroll more or less
            js.executeScript("window.dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));");
            try {
                Thread.sleep(50); // Adjust the sleep time for smoother or faster scrolling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll up using the UP arrow key
        for (int i = 0; i < 30; i++) { // Adjust the loop count to scroll more or less
            js.executeScript("window.dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowUp'}));");
            try {
                Thread.sleep(50); // Adjust the sleep time for smoother or faster scrolling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
