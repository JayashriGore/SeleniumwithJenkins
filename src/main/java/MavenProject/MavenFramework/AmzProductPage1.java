package MavenProject.MavenFramework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzProductPage1 {
	
WebDriver driver;
	
	//Step1
	
    @FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
    WebElement wishlistlist;
    
	
    @FindBy(linkText="View Your List")
    WebElement viewyourlist;
    
    @FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
    WebElement addtocart;  
    
    @FindBy(linkText="View Cart")
    WebElement viewcart;
    
    
   // Step2 
    public void addtowishlist()
    {
    wishlistlist.click();
    }
    	
    public void viewyourlistproduct()
    {
    viewyourlist.click();
    }
    
    public void addtocartpro()
    {
    	addtocart.click();
    }
    
    public void viewcartpro()
    {
    	viewcart.click();
    }
    	
    
    
   // Step3
    
    public AmzProductPage1(WebDriver driver) 
    {
 
    PageFactory.initElements(driver, this);
}

}
