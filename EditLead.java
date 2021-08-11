package seleniumweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
    @Test
	public void runEditlead() throws InterruptedException {
		
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
		 driver.findElementByXPath("(//label[text()='First name:'])[3]/following-sibling::div/input").sendKeys("baristo");
         driver.findElementByXPath("//button[text()='Find Leads']").click();
         Thread.sleep(2000);
         driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
         String pagetitle="View Lead | opentaps CRM";
         System.out.println(driver.getTitle());
         if(pagetitle.equals(driver.getTitle()))
         {
        	 System.out.println("Title verified");
         }
         driver.findElementByLinkText("Edit").click();
         Thread.sleep(2000);
         driver.findElementById("updateLeadForm_companyName").clear();
         driver.findElementById("updateLeadForm_companyName").sendKeys("infy");
         driver.findElementByXPath("//input[@value='Update']").click();
        String newName= driver.findElementById("viewLead_companyName_sp").getText();
        String name=newName.replaceAll("[^a-zA-Z]+","");
        System.out.println(name);
        driver.close();
       
		 
		 
			/**
			 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
			 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Enter first name
			 * 9 Click Find leads button 10 Click on first resulting lead 11 Verify title of
			 * the page 12 Click Edit 13 Change the company name 14 Click Update 15 Confirm
			 * the changed name appears 16 Close the browser (Do not log out)
			 */

	}

}
