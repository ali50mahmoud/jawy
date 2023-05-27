package page;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_defnition.Hooks;


import java.time.Duration;


public class Base {

	// *****************************************wait element to be clickbale
	// *************************************************//
	public static void waitclickable(By element) {
		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element));
	}

//*****************************************wait element to be visible *************************************************//
	public static void waitVisible(By element) {
		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	///////////////////////

	public static By ae = By.xpath("//a[@id='ae']");
	public static By eg = By.xpath("//a[@id='eg']");
	public static By jr = By.xpath("//a[@id='jo']");

//	public static By Type = By.xpath("//h4[.='CLASSIC']");
//	public static By Price = By.xpath("//b[.='7.00']");
//	public static By Currency = By.xpath("//div[.='From 7.00 Egyptian pound/month']");

	public void SelectServeces(String country) throws InterruptedException {
//		final By select = By.xpath("//span[@id='arrow']");
//		JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(select));
//		js.executeScript("arguments[0].click()", Hooks.driver.findElement(select));

		// hit_select
		Thread.sleep(1000);
		final By select = By.xpath("//span[@id='arrow']");
		Thread.sleep(1000);
		Hooks.driver.findElement(select).click();

		//

		// select countries
		if (country.equals("Select_AE")) {
			waitclickable(ae);
			WebElement Select_AE = Hooks.driver.findElement(ae);
			Select_AE.click();
			SelectServeces();
//			

		} else if (country.equals("Select_EG")) {
			waitclickable(eg);
			WebElement Select_EG = Hooks.driver.findElement(eg);
			Select_EG.click();
			SelectServeces();
		} else if (country.equals("Select_JR")) {
			waitclickable(jr);
			WebElement Select_JR = Hooks.driver.findElement(jr);
			Select_JR.click();
			SelectServeces();
		}
	}

	public void SelectServeces() {

		final By eg_Type = By.xpath("//h4[.='CLASSIC']");
		WebElement eg_type = Hooks.driver.findElement(eg_Type);
		String egy_type = eg_type.getText();
		final By eg_Price = By.xpath("//b[.='7.00']");
		WebElement eg_price = Hooks.driver.findElement(eg_Price);
		String egy_price = eg_price.getText();
		final By eg_Currency = By.xpath("//div[.='From 7.00 /month']");
		WebElement eg_currency = Hooks.driver.findElement(eg_Currency);
		String egy_currency = eg_currency.getText();

		final By ae_Type = By.xpath("//h4[.='CLASSIC']");
		WebElement ae_type = Hooks.driver.findElement(ae_Type);
		String aee_type = ae_type.getText();
		final By ae_Price = By.xpath("//b[.='10.00']");
		WebElement ae_price = Hooks.driver.findElement(ae_Price);
		String aee_price = ae_price.getText();
		final By ae_Currency = By.xpath("//div[@class='trial-cost']");
		WebElement ae_currency = Hooks.driver.findElement(ae_Currency);
		String aee_currency = ae_currency.getText();

		final By jr_Type = By.xpath("//h4[.='CLASSIC']");
		WebElement type = Hooks.driver.findElement(jr_Type);
		String jor_type = type.getText();
		final By jr_Price = By.xpath("//b[.='0.99']");
		WebElement jr_price = Hooks.driver.findElement(jr_Price);
		String jor_price = jr_price.getText();
		final By jr_Currency = By.xpath("//div[@class='trial-cost']");
		WebElement jr_currency = Hooks.driver.findElement(jr_Currency);
		String jor_currency = jr_currency.getText();

		if (egy_type.contains("classic") && egy_currency.contains("Egyptian pound") && egy_price.contains("7.00")) {
			System.out.println("Eg 🗸");
		} else if (aee_type.contains("classic") && aee_currency.contains("AED") && aee_price.contains("10.00")) {
			System.out.println("ae 🗸");
		} else if (jor_type.contains("classic") && jor_currency.contains("JOD") && jor_price.contains("0.99")) {
			System.out.println("jod 🗸");
		} else {
			System.out.println("problem");
		}
	}
}

//
//	

//	public void hit_signup() throws InterruptedException {
//		
//		
//		
//		final By hit_signup = By.xpath("//a[.='Sign up']");
//		final By u_name = By.xpath("//input[@id='sign-username']");
//		final By pass = By.xpath("//input[@id='sign-password']");
//		final By signUp_btn = By.xpath("//button[.='Sign up']");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(hit_signup));
//		Hooks.driver.findElement(hit_signup).click();
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(u_name));
//		Hooks.driver.findElement(u_name).sendKeys("cccyyyzzz");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(pass));
//		Hooks.driver.findElement(pass).sendKeys("test123");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(signUp_btn));
//		Hooks.driver.findElement(signUp_btn).click();
//
//		// Hooks.driver.switchTo().frame(0);
//		Thread.sleep(1000);
//		Hooks.driver.switchTo().alert().accept();
//
//	}
////########################################################################3
//	public void hit_Login() throws InterruptedException {
//		final By hit_login = By.xpath("//a[.='Log in']");
//		final By login_name = By.xpath("//input[@id='loginusername']");
//		final By login_pass = By.xpath("//input[@id='loginpassword']");
//		final By Login_btn = By.xpath("//button[.='Log in']");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(hit_login));
//		Hooks.driver.findElement(hit_login).click();
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(login_name));
//		Hooks.driver.findElement(login_name).sendKeys("cccyyyzzz");
//
//		
//		Hooks.driver.findElement(login_pass).sendKeys("test123");
//
//		
//		Hooks.driver.findElement(Login_btn).click();
//		Thread.sleep(1000);
//
//	}
////#########################################################################################	
//	 public void CheckListedCat_hasItems() throws InterruptedException {
//			final By click_laptops = By.xpath("//a[.='Laptops']");
//			Hooks.driver.findElement(click_laptops).click();
//			Thread.sleep(1000);
//			final By item = By.xpath("//h4[.='Sony vaio i5']");
//
//		 
//		 	new WebDriverWait(Hooks.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(item));
//		 	WebElement TextOfItem = Hooks.driver.findElement(item);
//		 	assertEquals(TextOfItem.getText(), "Sony vaio i5");
//			System.out.println("THE LISTED CATEGORIES ALREADY HAS ITEMS"  );
//
//		 }
////##################################################################3
//	 
//	public void Add_item() throws InterruptedException {
//		final By select_category = By.xpath("//a[.='Phones']");
//		final By select_item = By.xpath("//a[.='Samsung galaxy s6']");
//		final By add_toCart = By.xpath("//a[.='Add to cart']");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(select_category));
//		Hooks.driver.findElement(select_category).click();
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(select_item));
//		Hooks.driver.findElement(select_item).click();
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(add_toCart));
//		Hooks.driver.findElement(add_toCart).click();
//
//		Thread.sleep(1000);
//		Hooks.driver.switchTo().alert().accept();
//
//	}
//	//###################################################################
//	
//	public static By hit_cart = By.xpath("//a[@id='cartur']");
//
//	public void Remove_item() throws InterruptedException {
//
//		final By delete_item = By.xpath("//a[.='Delete']");
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(hit_cart));
//		Hooks.driver.findElement(hit_cart).click();
//
//		new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
//				.until(ExpectedConditions.visibilityOfElementLocated(delete_item));
//		Hooks.driver.findElement(delete_item).click();
//
//	}
////#############################################################################33
//	
//	public void Checkout_item() throws InterruptedException {
//		final By hit_Home = By.xpath("//a[.='Home (current)']");
//		final By place_order = By.xpath("//button[@class='btn btn-success']");
//		final By name = By.xpath("//input[@id='name']");
//		final By country = By.xpath("//input[@id='country']");
//		final By city = By.xpath("//input[@id='city']");
//		final By credit_card = By.xpath("//input[@id='card']");
//		final By month = By.xpath("//input[@id='month']");
//		final By year = By.xpath("//input[@id='year']");
//		final By purchace_btn = By.xpath("//button[.='Purchase']");
//		
//		
//        Hooks.driver.findElement(hit_Home).click();
//
//		Add_item();
//		
//        Hooks.driver.findElement(hit_cart).click();
//        
//        Hooks.driver.findElement(place_order).click();
//        Thread.sleep(1000);
//        
//        Hooks.driver.findElement(name).sendKeys("rrrr");
//        Hooks.driver.findElement(country).sendKeys("rrrr");
//        Hooks.driver.findElement(city).sendKeys("rrrr");
//        Hooks.driver.findElement(credit_card).sendKeys("rrrr");
//        Hooks.driver.findElement(month).sendKeys("rrrr");
//        Hooks.driver.findElement(year).sendKeys("rrrr");
//		
//        
//        Hooks.driver.findElement(purchace_btn).click();
//     
//		
//	}
////###################################################################################3
//	
//	
//	 public void Validate_Successful_Checkout() throws InterruptedException {
//			final By checkout = By.xpath("//h2[.='Thank you for your purchase!']");
//			
//		 	new WebDriverWait(Hooks.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(checkout));
//		 	WebElement CheckoutText = Hooks.driver.findElement(checkout);
//		 	assertEquals(CheckoutText.getText(), "Thank you for your purchase!");
//			System.out.println("THANK YOU FOR YOUR PURCHASE!"  );
//			
//			final By ok_btn = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");
//			Thread.sleep(1000);
//			Hooks.driver.findElement(ok_btn).click();
//
//	 }
