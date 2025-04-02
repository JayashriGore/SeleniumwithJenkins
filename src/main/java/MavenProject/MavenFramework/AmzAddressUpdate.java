package MavenProject.MavenFramework;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmzAddressUpdate 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
    WebElement accountsandlist;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	 @FindBy(linkText="Your Account")
	  WebElement youraccount;
	 
	 WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		@FindBy(xpath="//div[@class='a-section a-color-tertiary add-address-text']")
		WebElement newaddress;
	
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']")
	WebElement youraddress;
	@FindBy(xpath="(//a[@class='a-link-normal'])[3]")
	WebElement editaddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	
	@FindBy(xpath="//span[@class='a-button a-button-primary']")
	WebElement updateaddress;
	
	
	
	 @FindBy(xpath = "//span[.='Sign Out']")
	    WebElement signout;

	 public void hoveroveronAccountsandlist(WebDriver driver)
	    
	 { 
	    	
	   // Actions a1=	new Actions(driver); //this parameter come from above method parameter 
	   // a1.moveToElement(accountsandlist).perform();
	    accountsandlist.click();
	 }
	 
	 public void youraccount_click()
		{
		 youraccount.click();
		}
		
	 
	public void youraddress1()
	{
		youraddress.click();
	}
	
	public void newadd()
	{
		newaddress.click();
	}
	
	/*public void editaddress1()
	{
		editaddress.click();
	}
	
	*/
	
	public void fullname1()
	{
		
		fullname.clear();
		fullname.sendKeys("Jayashri Gore"+Keys.ENTER);
	}
	
	public void address()
	{
		address.clear();
		address.sendKeys("B-701,Kool home panchamrut, Near Balaji Furniture, PUNE, MAHARASHTRA, 411046, India, Phone ,number: 8805660575"+Keys.ENTER);
	}
	
	public void newaddressup()
	{
		updateaddress.click();
	}
	
	
	 public void signoutaccount()
	    {
	    signout.click();
	    }
	public AmzAddressUpdate (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
	
	
	
	
	
	
	
	
	
	
	/*WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-span12 a-button-primary']")
	WebElement buy;
	
	
	@FindBy(xpath="(//a[@class='a-link-normal celwidget'])[1]")
	WebElement editaddress;
	

	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullname;
	
	@FindBy(xpath="(//span[@id='checkout-primary-continue-button-id'])[2]")
	WebElement usethisaddress;
	
	
	public void proceedtobuy()
	
	{
		buy.click();
	}
	
   public void newaddress()
	
	{
	editaddress.click();
	}
	
   public void name()
	
	{
	   fullname.clear();
	   fullname.sendKeys("Jayashri Gore");
	}
   
   public void updatedadd()
	
  	{
	   usethisaddress.click();
  	}
	
	public AmzAddressUpdate(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	*/

