package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mainjava.BaseClass;
import mainjava.DashBoardPage;
import mainjava.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest extends BaseClass{

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdrive.chrome.drive","C:\\Users\\Hp\\Desktop\\chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	}
	@BeforeClass
	public void pageObjects() {
		loginpage=new LoginPage(driver);
		dashboardpage=new DashBoardPage(driver);
		
	}
	
	@AfterClass
	public void tearDownEnvirnment() {
		driver.quit();
	}
}

