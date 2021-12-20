package D1.Task.Mercury.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MercuryTourReg {

	WebDriver driver;
	
	public MercuryTourReg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	WebElement fname;
	
	@FindBy(how=How.NAME,using="lastName")
	WebElement lname;
	
	@FindBy(how=How.NAME,using="userName")
	@CacheLookup
	WebElement uname;
	
	@FindBy(how=How.NAME,using="phone")
	WebElement phone;
	
	@FindBy(how=How.NAME,using="address1")
	WebElement adr;
	
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	
	@FindBy(how=How.NAME,using="state")
	WebElement state;
	
	@FindBy(how=How.NAME,using="postalCode")
	WebElement pin;
	
	@FindBy(how=How.NAME,using="country")
	WebElement co;
	
	@FindBy(how=How.NAME,using="email")
	WebElement email;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	WebElement cpass;
	
	@FindBy(how=How.NAME,using="submit")
	WebElement submit;
	
	public void regUser(String name,String lastname,String username,String phoneno,String adrs,String city1,String state1,String pin1,String country,String email1,String pass1,String cpass1)
	{
	fname.sendKeys(name);
	lname.sendKeys(lastname);
	uname.sendKeys(username);
	phone.sendKeys(phoneno);
	adr.sendKeys(adrs);
	city.sendKeys(city1);
	state.sendKeys(state1);
	pin.sendKeys(pin1);
	co.sendKeys(country);
	email.sendKeys(email1);
	pass.sendKeys(pass1);
	cpass.sendKeys(cpass1);
	submit.click();
	}
	
}
