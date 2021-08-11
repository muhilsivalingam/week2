package seleniumweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
    @Test
	public void runDuplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
         driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Leads").click();
		 driver.findElementByLinkText("Find Leads").click();
		 driver.findElementByXPath("//span[text()='Email']").click();
		 driver.findElementByName("emailAddress").sendKeys("bo@gmail.com");
         driver.findElementByXPath("//button[text()='Find Leads']").click();
		 Thread.sleep(1000);
		 String fName=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		 String lName=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a").getText();
		 System.out.println(fName+" "+lName);
		 String orgName=fName.concat(lName);
		 System.out.println(orgName);
		 driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
		 driver.findElementByLinkText("Duplicate Lead").click();
		 String titleExpected="Duplicate Lead";
		 String titleActual=driver.getTitle();
		 if(titleExpected.equals(titleActual))
		 {
			 System.out.println("title matches");
		 }
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
		 String fNamedup=driver.findElementById("viewLead_firstName_sp").getText();
		 String lNamedup=driver.findElementById("viewLead_lastName_sp").getText();
		 String dupName=fNamedup.concat(lNamedup);
		 System.out.println(dupName);
		 if(orgName.equals(dupName))
		 {
			 System.out.println("Duplicate name matches the original lead name");
		 }
		 driver.close();
	}

}


/*
 * http://leaftaps.com/opentaps/control/main
 * 
 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Click on Email 9
 * Enter Email 10 Click find leads button 11 Capture name of First Resulting
 * lead 12 Click First Resulting lead 13 Click Duplicate Lead 14 Verify the
 * title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm the duplicated lead
 * name is same as captured name 17 Close the browser (Do not log out)
 */