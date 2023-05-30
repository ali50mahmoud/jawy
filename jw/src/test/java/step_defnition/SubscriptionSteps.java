package step_defnition;



import java.io.IOException;

import io.cucumber.datatable.DataTable; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Base;

public class SubscriptionSteps {

	Base base = new Base();

	@Given("I navigate to the URL")
	public void navigateToURL() throws InterruptedException {
		Hooks.driver.navigate().to("https://subscribe.jawwy.tv/");
	}

	@When("I validate the Subscription Packages for country {string}")
	public void validateSubscriptionPackages(String country) throws InterruptedException, IOException {
		base.captureScreenshot("screenshot1");
		base.SelectServeces(country);
		
		base.captureScreenshot("screenshot1");

	}

	@Then("I verify the Type, Price, and Currency for all packages")
	public void verifyTypePriceCurrency(DataTable dataTable) {
//		// Retrieve the data table as a list of maps
//		public static By Type = By.xpath("(//img[@src='/SmartChannels/img/ico_translate.svg?12156'])[5]");
//		
//		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
//
//		// Iterate over the rows of data and perform verification for each package
//		for (Map<String, String> row : data) {
//			String type = row.get("Type");
//			String price = row.get("Price");
//			String currency = row.get("Currency");
//			
//		//	implicitwait();
//		//	Thread.sleep(1000);
//		//	waitVisible(PaymentValue);
//		//	WebElement ValueOfPayment = Hooks.driver.findElement(Value);
//		//	assertEquals(type, "egp");
//		}

	}
}
