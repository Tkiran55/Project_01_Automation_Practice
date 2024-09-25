package automationexerise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
	
	public static String url = "https://automationexercise.com/";
	public static ChromeDriver driver;
	
	@BeforeSuite
	public static void open_Browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterSuite
	public static void close_Browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
