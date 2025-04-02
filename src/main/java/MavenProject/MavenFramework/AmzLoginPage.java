package MavenProject.MavenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzLoginPage 
{
WebDriver driver;
	
	//Step1
	//first component
   
    @FindBy(name="email")
    WebElement username;
    
	//second component
    @FindBy(id="continue")
    WebElement continue_Button;
    
    @FindBy(id = "ap_password")
    WebElement password;
   
    @FindBy(id = "signInSubmit")
    WebElement sign_Button;
    
   // Step2 of 1
   public void UN() {
	   username.sendKeys("8805660575");
   } 
    
   public void Continue_button() {
	   continue_Button.click();
   }
   
   public void PS() {
	   password.sendKeys("Babi@pune51");
   }
   
   public void sign_button() {
	   sign_Button.click();
   }
   
   // Step3
    
    
    public AmzLoginPage(WebDriver driver) 
    {
 
    PageFactory.initElements(driver, this);
    }
}
