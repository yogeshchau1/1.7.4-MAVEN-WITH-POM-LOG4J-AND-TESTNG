package D1.Task.Mercury.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MercuryTourFlightBook {

	WebDriver driver;
	
	public MercuryTourFlightBook(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.NAME,using="tripType")
	WebElement trip;
	
	@FindBy(how=How.NAME,using="passCount")
	WebElement passanger;
	
	@FindBy(how=How.NAME,using="fromPort")
	WebElement source;
	
	@FindBy(how=How.NAME,using="fromMonth")
	WebElement month;
	
	@FindBy(how=How.NAME,using="fromDay")
	WebElement day;
	
	@FindBy(how=How.NAME,using="toPort")
	WebElement dest;
	
	@FindBy(how=How.NAME,using="toMonth")
	WebElement rmonth;
	
	@FindBy(how=How.NAME,using="toDay")
	WebElement rday;
	
	@FindBy(how=How.NAME,using="servClass")
	WebElement fclass;
	
	@FindBy(how=How.NAME,using="airline")
	WebElement airline;
	
	@FindBy(how=How.NAME,using="findFlights")
	WebElement submit;
	
	public void FlightBook()
	{
		trip.click();
		
		WebElement web=passanger;
		Select sel=new Select(web);
		sel.selectByIndex(2);
		
		WebElement web1=source;
		Select sel1=new Select(web1);
		sel1.selectByIndex(2);
		
		WebElement web2=month;
		Select sel2=new Select(web2);
		sel2.selectByIndex(2);
		
		WebElement web3=day;
		Select sel3=new Select(web3);
		sel3.selectByIndex(2);
		
		WebElement web4=dest;
		Select sel4=new Select(web4);
		sel.selectByIndex(2);
		
		WebElement web5=rmonth;
		Select sel5=new Select(web5);
		sel5.selectByIndex(2);
		
		WebElement web6=rday;
		Select sel6=new Select(web6);
		sel6.selectByIndex(2);
		
		fclass.click();
		
		WebElement web8=airline;
		Select sel8=new Select(web8);
		sel8.selectByIndex(2);
		submit.click();
	}
}
