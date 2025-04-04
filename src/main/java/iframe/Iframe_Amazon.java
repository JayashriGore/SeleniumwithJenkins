package iframe;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_Amazon 
{
	 public static void main(String[] args) throws InterruptedException 
		{
			EdgeDriver driver= new EdgeDriver();
			driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
			WebElement e1=  driver.findElement(By.xpath("(//input)[5]"));
			e1.sendKeys("shoes"+Keys.ENTER);
			WebElement firstshoe= driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")); 
			firstshoe.click();
			Set<String> pcid=driver.getWindowHandles();
			System.out.println(pcid);
			 Iterator<String> pc =pcid.iterator();
			 String parentid=pc.next();
			 String childid=pc.next();
			 driver.switchTo().window(childid);
			
			 WebElement wishlist= driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
			 wishlist.click();
			
			 WebElement mobile= driver.findElement(By.xpath("//input[@name='email']"));
			 mobile.sendKeys("8805660575");
			 WebElement continu = driver.findElement(By.id("continue"));
			 continu.click();
			// Thread.sleep(3000);
			 WebElement pa= driver.findElement(By.xpath("//input[@id='ap_password']"));
			 pa.sendKeys("Babi@pune51");
			Thread.sleep(3000);
			WebElement signin1 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			signin1.click();
			//Thread.sleep(3000);
			WebElement cart = driver.findElement(By.xpath("//span[@class='a-button a-spacing-small a-button-primary a-button-icon']"));
			cart.click();
			
		   WebElement buy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		   buy.click();
		   
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement delivertoaddrss = driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		   delivertoaddrss.click();
		   
		   
		   
		   /*Thread.sleep(3000);
		   WebElement cod = driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[5]"));
		   cod.click();
		   */
		   
		   
		
		   WebElement creditcard = driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[1]"));
		   creditcard.click();
		 
		  // (//input[@name='ppw-instrumentRowSelection'])[2]
		   
		   
		}
}
