package test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority=0,groups= {"smoke","regression"})
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPage=loginpage.titleOfLoginPage();
		AssertJUnit.assertEquals(verifyTitleOfLoginPage,"Login");
		
	}
	@Test(priority=1,groups= {"smoke","regression"})
     public void verifyUrlOfLoginPage() {
		String verifyTitleOfLoginPage=loginpage.urlOfPage();
		AssertJUnit.assertEquals(verifyTitleOfLoginPage,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=2,groups= {"smoke","regression"})
public void verifyLoginWithCorrectCredentials() {
		loginpage.setUserName("Admin");
		loginpage.setPassword("admin123");
		String titleOfDash=dashboardpage.titleOfDashBoardPage();
		AssertJUnit.assertEquals(titleOfDash,"DashBoard");
	}
	@Test(priority=-1,groups= {"smoke","regression"})
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild=loginpage.getBuildTitle();
		AssertJUnit.assertEquals(verifyTitleOfBuild, "OranageHRM");
	}

}

