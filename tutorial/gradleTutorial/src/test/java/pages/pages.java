package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pages {
	WebDriver driver;
	By usernameTextField = By.className("inputLogin");
	By passwordTextField = By.id("password");
	By loginButton = By.id("loginBtn");
	
	public pages (WebDriver driver){
		this.driver = driver;
	}
	
	public pages enterUserName(String value){
		WebElement username = driver.findElement(usernameTextField);
		username.sendKeys(value);
		return this;
	}
	
	//implement enterPassword
	public pages enterPassword(String value){
		WebElement password = driver.findElement(passwordTextField);
		password.sendKeys(value);
		return this;
	}
	
	//implement clickLoginButton
	public pages clickLoginButton(){
		WebElement login = driver.findElement(loginButton);
		login.click();
		return this;
	}
}
