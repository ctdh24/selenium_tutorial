import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	@Test
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa-1.objectbrains.com/servicing/#/login");
		Thread.sleep(5000);
		
		By usernameTextField = By.id("username");
		WebElement username = driver.findElement(usernameTextField);
		username.sendKeys("admin");
		
		By PasswordTextField = By.id("password");
		WebElement password = driver.findElement(PasswordTextField);
		password.sendKeys("password");
		
		By loginButton = By.id("loginBtn");
		WebElement login = driver.findElement(loginButton);
		login.click();
		
		driver.quit();
	}
}
