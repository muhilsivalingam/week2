package week2.day2.assignment3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("https://www.redbus.in/"); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElementById("src").sendKeys("Chennai");
		 driver.findElementById("src").click();
		 driver.findElementById("dest").sendKeys("Bangalore");
		 driver.findElementById("dest").click();
		 driver.findElementByXPath("//i[@class='icon solr-icon icon-ic-city']").click();
		 driver.findElementById("dest").click();
		 driver.findElementByXPath("//div[@class='fl search-box date-box gtm-onwardCalendar']/span").click();
		 driver.findElementByXPath("//td[text()='23']").click();
		 driver.findElementById("search_btn").click();
		 driver.findElementByXPath("//i[@class='icon icon-close c-fs']").click();
		 Thread.sleep(2000);
		 driver.findElementByClassName("close-primo").click();
		 String results=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		 System.out.println(results);
		 driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();
		 String sleeper=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		 System.out.println(sleeper);
		 driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();
		 driver.findElementByXPath("(//label[@for='bt_AC'])[1]").click();
		 String ac=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		 System.out.println(ac);
		 driver.findElementByXPath("(//label[@for='bt_AC'])[1]").click();
		 driver.findElementByXPath("//label[@for='bt_NONAC']").click();
		 String nonac=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		 System.out.println(nonac);
		 
		 
		 
	}

}


/*
 * Go to https://www.redbus.in/ in chrome 2.Type Chennai in From textBox and
 * ENTER 3.Type Bengaluru in Destination textBox and ENTER 4.Choose any date in
 * JULY 5.Click Search Buses 6.Close the popup using the X button at the right
 * corner 7.Print the number of search results 8.Choose only Sleeper Bus 9.Print
 * the number of search results 10.Deselect the sleeper Bus and select the AC
 * bus alone 11.Print the number of search results 12.Choose also Non AC buses
 * 13.Print the number of search results
 */