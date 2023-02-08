package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageee {
	
	WebDriver driver;
	
	By username=By.id("email");
	By password=By.xpath(".//*[@id='pass']");
	By loginButton=By.name("login");
	
	public LoginPageee(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
	}
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();

}
}
