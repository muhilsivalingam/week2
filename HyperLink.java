package week2day2assign1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.util.List;
import java.util.concurrent.TimeUnit;
	public class HyperLink {
	   public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
	      String url = "http://leafground.com/pages/Link.html";
	      driver.get(url);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElementByLinkText("Go to Home Page").click();
	     driver.navigate().back();
	     String page=driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
	     System.out.println(page);
	     driver.findElementByLinkText("Verify am I broken?").click();
	     String title=driver.getTitle();
	     if(title.contains("404"))
	     {
	    	System.out.println("broken page"); 
	     }
	     //no clear with 5th link activity
	     //number of links
	     driver.navigate().back();
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is " + links.size());
	     
	     
	     
	    
	     driver.close();
	     
	}
	}
