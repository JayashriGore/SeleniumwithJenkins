package brokenlinks_find;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks 
{
	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	List<WebElement> e1=	driver.findElements(By.tagName("a"));
	int count=	e1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e2=						e1.get(i);
				String linktext=					e2.getText();
			String link=			e2.getDomAttribute("href");
			System.out.println(linktext);
			System.out.println(link);
			verifylink(link);
		}
	}
	static void verifylink(String url) throws IOException
	{
		try {
		URL u1=new URL(url);
		HttpURLConnection c1=					(HttpURLConnection) u1.openConnection();
				if(c1.getResponseCode()==200)
				{
					System.out.println("Link is valid " +url +"  "+ c1.getResponseMessage());
				}
				else
				{
					System.out.println("link is not validsss "+url+"  "+c1.getResponseMessage());

				}
		}
		catch(MalformedURLException m1)
		{
			System.out.println("Had the exception in my dinner");
		}
					
	}
}