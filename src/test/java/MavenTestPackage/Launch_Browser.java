package MavenTestPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com");
	}
	
}


