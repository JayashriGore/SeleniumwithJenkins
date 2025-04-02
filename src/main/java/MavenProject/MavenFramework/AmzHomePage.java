package MavenProject.MavenFramework;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmzHomePage 
{
	WebDriver driver;
	
	//Step1
	//first component
    @FindBy(xpath="//span[@class='nav-line-2 ']")
    WebElement accountsandlist;
    
	//second component
    @FindBy(xpath="(//span[.='Sign in'])[1]")
    WebElement signin;
    
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchProduct;
    
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
    WebElement FirstProduct;
    
   

    @FindBy(xpath = "//span[.='Sign Out']")
    WebElement signout;
    
    
    
    
   // Step2 of 1
    public void hoveroveronAccountsandlist(WebDriver driver)
    
    {
    	
    Actions a1=	new Actions(driver); //this parameter come from above method parameter 
    a1.moveToElement(accountsandlist).perform();
    
    }
    
    public void signin_click() // not required parameter because only need to click
    {
    	signin.click();
    }
    
    public void seachProduct () {
    	searchProduct.sendKeys("shoes"+Keys.ENTER);
    }
    public void First_Product (WebDriver driver) 
    {
    	FirstProduct.click();
    	
    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    		Set<String> pcid=driver.getWindowHandles();
    		System.out.println(pcid);
    		 Iterator<String> pc =pcid.iterator();
    		 String parentid=pc.next();
    		 String childid=pc.next();
    		 driver.switchTo().window(childid);
    }
    
    public void signoutaccount()
    {
    signout.click();
    }
   // Step3
    
    public AmzHomePage(WebDriver driver) 
    {
 
    PageFactory.initElements(driver, this);
}

	
    
}
