package mainjava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseClass{

	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
      public   DashBoardPage(WebDriver driver) {
    	  this .driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      
      public String titleOfDashBoardPage() {
    	  return titleDashBoard.getText();
      }
}



