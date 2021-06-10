package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChefPinDinerLoginPage {

	public WebDriver driver;
	By email = By.id("exampleInputEmail1");
	By password = By.id("Password");
	By login = By.cssSelector("button[type='submit']");
	
	//Driver Initialize
	public ChefPinDinerLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	//Return email element
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	//Return password element
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	//Return Login Button Element
	public WebElement getLoginButton() {
		return driver.findElement(login);
	}
	
	
}
