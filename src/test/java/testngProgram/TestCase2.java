package testngProgram;

import org.testng.annotations.Test;

import MavenProject.MavenFramework.AmzCartPage;
import MavenProject.MavenFramework.AmzHomePage;
import MavenProject.MavenFramework.AmzLoginPage;
import MavenProject.MavenFramework.AmzProductPage1;

public class TestCase2 extends LaunchQuit 
{
	@Test

	public void login_search_wishlist_cart_logout() 
	{
		
		AmzHomePage homepage = new AmzHomePage(driver);  
		homepage.hoveroveronAccountsandlist(driver);
	     homepage.signin_click();
	 

	     AmzLoginPage loginpage=new AmzLoginPage (driver);
	     loginpage.UN();
	     loginpage.Continue_button();
	     loginpage.PS();
	     loginpage.sign_button();
		
	     homepage.seachProduct();
	     homepage.First_Product(driver);
	     
	     AmzProductPage1 product = new  AmzProductPage1(driver);
	     product.addtowishlist();
	     product.viewyourlistproduct();
	     product.addtocartpro();
	     product.viewcartpro();
	     
	     
	     //remove product
	     AmzCartPage removepro  =  new AmzCartPage(driver);
	     removepro.removecart();
	     
	     
	     homepage.hoveroveronAccountsandlist(driver);
	     homepage.signoutaccount();
	     
	}	     
}
