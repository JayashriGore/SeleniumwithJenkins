package MavenProject.MavenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzCartPage 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement removeproduct;
	public void removecart()
	
	{
		removeproduct.click();
	}
	
	public AmzCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
