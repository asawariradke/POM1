package mainjava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	//ALL the locator of page
	@FindBy(xpath="//*[text()='Login']")
	WebElement textLoginPage;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(tagName="button")
	WebElement btnlogin;
	
	//initialization of locators /variables
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public String titleOfLoginPage() {
		return textLoginPage.getText();
	}
	
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	public void setUserName(String usrName) {
		username.sendKeys(usrName);
	}
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	public void clickLoginbtn() {
		btnlogin.click();
	}
	public String getBuildTitle() {
		return driver.getTitle();
	}
}

