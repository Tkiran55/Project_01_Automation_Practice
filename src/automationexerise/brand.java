package automationexerise;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class brand  extends setup{
	private static final String[] urls = {
		    "https://automationexercise.com/brand_products/Polo",
		    "https://automationexercise.com/brand_products/H&M",
		    "https://automationexercise.com/brand_products/Madame",
		    "https://automationexercise.com/brand_products/Mast%20&%20Harbour",
		    "https://automationexercise.com/brand_products/Babyhug",
		    "https://automationexercise.com/brand_products/Allen%20Solly%20Junior",
		    "https://automationexercise.com/brand_products/Kookie%20Kids",
		    "https://automationexercise.com/brand_products/Biba"
		};
		
		@Test
		public void chooseBrands() {
			// Loop through each URL and navigate to the page
			for (String url : urls) {
		        driver.get(url);
		        verifyPageTitle();
		    }
		}
		
		private void verifyPageTitle() {
			// Mapping page titles to success messages
		    Map<String, String> pageTitleMap = new HashMap<>();
		    pageTitleMap.put("Automation Exercise - Polo Products", "Success Polo");
		    pageTitleMap.put("Automation Exercise - H&M Products", "Success H&M");
		    pageTitleMap.put("Automation Exercise - Madame Products", "Success Madame");
		    pageTitleMap.put("Automation Exercise - Mast & Harbour Products", "Success Mast");
		    pageTitleMap.put("Automation Exercise - Babyhug Products", "Success Babyhug");
		    pageTitleMap.put("Automation Exercise - Allen Solly Junior Products", "Success Allen");
		    pageTitleMap.put("Automation Exercise - Kookie Kids Products", "Success Kookie");
		    pageTitleMap.put("Automation Exercise - Biba Products", "Success Biba");

		    // Get the page title and print the corresponding success message
		    String pageTitle = driver.getTitle();
		    System.out.println(pageTitleMap.getOrDefault(pageTitle, "Not Matched"));
		}
	}
