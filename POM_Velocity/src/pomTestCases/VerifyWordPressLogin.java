package pomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.LoginPageee;

public class VerifyWordPressLogin {
	
	@Test
	public void verifyValisLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		
		LoginPageee login=new LoginPageee(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLoginButton();
		
		driver.quit();
	}

}

