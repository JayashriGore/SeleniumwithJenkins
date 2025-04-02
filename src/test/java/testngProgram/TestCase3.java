package testngProgram;


import org.testng.annotations.Test;

import MavenProject.MavenFramework.AmzAddressUpdate;

import MavenProject.MavenFramework.AmzHomePage;
import MavenProject.MavenFramework.AmzLoginPage;
import MavenProject.MavenFramework.AmzProductPage1;

public class TestCase3 extends LaunchQuit
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
	     
	    
	     homepage.hoveroveronAccountsandlist(driver);
	
	     
	    // UpdatNewAddress
	     
	     AmzAddressUpdate address = new AmzAddressUpdate(driver);
	     address.youraccount_click();
	     address.youraddress1();
	     address.newadd();
	     //address.editaddress1();
	     address.fullname1();
	     address.address();
         //address.newaddress();
	     address.newaddressup();
	     
	     
	    
	     
	     //Signout
	     homepage.hoveroveronAccountsandlist(driver);
	     homepage.signoutaccount();
	     
	     /* AmzProductPage1 product = new  AmzProductPage1(driver);
	     product.addtowishlist();
	     product.viewyourlistproduct();
	     product.addtocartpro();
	     product.viewcartpro();
	    */ 
	     //remove product
	     //AmzCartPage removepro  =  new AmzCartPage(driver);
	     //removepro.removecart();
	     
	}	     
}