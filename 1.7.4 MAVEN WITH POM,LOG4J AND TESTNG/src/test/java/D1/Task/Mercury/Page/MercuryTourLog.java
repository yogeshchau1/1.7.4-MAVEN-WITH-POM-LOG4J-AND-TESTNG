package D1.Task.Mercury.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MercuryTourLog {

	
	WebDriver driver;
	
	public MercuryTourLog(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="userName")
	WebElement uname;
	
	@FindBy(how=How.NAME,using="password")
	WebElement pass;
	
	@FindBy(how=How.NAME,using="submit")
	WebElement submit;
	
	public void logUser(String username,String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
}
