import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.pages;

public class LoginTest2 {
	@Test
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		pages loginPage = new pages(driver);
		
		driver.get("https://qa-1.objectbrains.com/servicing/#/login");
		Thread.sleep(5000);
		
		loginPage.enterUserName("admin").enterPassword("password").clickLoginButton();
			
		//driver.quit();
	}
}
