package seleniumweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("http://leaftaps.com/opentaps/control/main"); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Leads").click();
		 driver.findElementByLinkText("Find Leads").click();
		 driver.findElementByXPath("//span[text()='Phone']").click();
		 //driver.findElementByName("phoneCountryCode").sendKeys("1");
		 driver.findElementByName("phoneAreaCode").sendKeys("345345");
		 driver.findElementByName("phoneNumber").sendKeys("8056432456");
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		 Thread.sleep(1000);
		 String leadId=driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a").getText();
		 System.out.println(leadId);
		 Thread.sleep(1000);
		 driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		 driver.findElementByLinkText("Delete").click();
		 driver.findElementByLinkText("Find Leads").click();
		 driver.findElementByName("id").sendKeys(leadId);
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		 String msg=driver.findElementByXPath("//div[text()='No records to display']").getText();
		 if(msg.equals("No records to display"))
		 {
			 System.out.println("deletion is successful");
		 }
		 
		 driver.close();
	}

}


/*
 * http://leaftaps.com/opentaps/control/main
 * 
 * Delete Lead: 1 Launch the browser 2 Enter the username 3 Enter the password 4
 * Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8
 * Click on Phone 9 Enter phone number 10 Click find leads button 11 Capture
 * lead ID of First Resulting lead 12 Click First Resulting lead 13 Click Delete
 * 14 Click Find leads 15 Enter captured lead ID 16 Click find leads button 17
 * Verify message "No records to display" in the Lead List. This message
 * confirms the successful deletion 18 Close the browser (Do not log out)
 */