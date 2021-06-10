package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ChefPinDinerLoginPage;
import resources.base;

public class ValidateChefPinDinerLogin extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("Chefpinloginurl"));
		log.info("Navigated to ChefPin Login page");
	}
	
	@Test
	public void validateChefPinDLogin() throws InterruptedException {
		ChefPinDinerLoginPage dl = new ChefPinDinerLoginPage(driver);
		dl.getEmail().sendKeys("dinerOne@yopmail.com");
		dl.getPassword().sendKeys("123456");
		dl.getLoginButton().click();
		Thread.sleep(3000);
		
		//Assertion
		String ActualUrl = "https://dev.chefp.in/diner-homepage1";
		Assert.assertEquals(ActualUrl, driver.getCurrentUrl());
	}
	
	@AfterTest
	public void teardown() {

		driver.close();

	}
	
	
}
