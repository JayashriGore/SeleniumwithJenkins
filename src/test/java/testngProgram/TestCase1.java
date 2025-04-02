package testngProgram;

import org.testng.annotations.Test;

import MavenProject.MavenFramework.AmzHomePage;
import MavenProject.MavenFramework.AmzLoginPage;
import MavenProject.MavenFramework.AmzProductPage1;

public class TestCase1 extends LaunchQuit 
{
@Test

public void login_search_wishlist_cart_logout() 
{
	
	AmzHomePage homepage = new AmzHomePage(driver);  // we are passing parameter because methods are parameterized and same driver go and invoke the public void hoveroveronAccountsandlist(WebDriver driver) of Amzpage and invoke the driver and wuth help of this driver we aare able to perform action on my given companant 
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
     
     
     homepage.hoveroveronAccountsandlist(driver);
     homepage.signoutaccount();
     
 }
}

/*

Test case how many Source file needed?
HomePage
LoginPage
SearchResultPage
ProductPage



*/