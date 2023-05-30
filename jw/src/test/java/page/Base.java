package page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_defnition.Hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Base {
	
	public  void takescreenshot(String name) throws IOException {
		File srcfile=((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"\\TestReport\\"+name+".png"));

	}
		

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


	public void SelectServeces(String country) throws InterruptedException, IOException {

		
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