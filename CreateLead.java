package seleniumweek2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
    @Test
	public void runCreateLead() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login"); 
		 driver.manage().window().maximize();
		 driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 Thread.sleep(2000);
		 driver.findElementByLinkText("Leads").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("tcs");
		 WebElement firstname=driver.findElementById("createLeadForm_firstName");
		 String s1="baristo";
		 firstname.sendKeys(s1);
		 driver.findElementById("createLeadForm_lastName").sendKeys("england");
		 driver.findElementById("createLeadForm_firstNameLocal").sendKeys("bo");
		 driver.findElementById("createLeadForm_lastNameLocal").sendKeys("eng");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("tc");
		driver.findElementById("createLeadForm_birthDate").sendKeys("29/06/2021");
		 driver.findElementById("createLeadForm_generalProfTitle").sendKeys("gps");
		 driver.findElementById("createLeadForm_departmentName").sendKeys("deep");
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("12345");
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
			 driver.findElementById("createLeadForm_sicCode").sendKeys("gpscode");
			 driver.findElementById("createLeadForm_tickerSymbol").sendKeys("symbolcs");
			 driver.findElementById("createLeadForm_description").sendKeys("description");
			 driver.findElementById("createLeadForm_importantNote").sendKeys("note");
			 //contact
			 driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("345345");
			 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8056432456");
			 driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("567");
			 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("bom");
			 driver.findElementById("createLeadForm_primaryEmail").sendKeys("bo@gmail.com");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://be.cog.com");
			//Address
			 driver.findElementById("createLeadForm_generalToName").sendKeys("try");
			 driver.findElementById("createLeadForm_generalAttnName").sendKeys("nsszfdsf");
			 driver.findElementById("createLeadForm_generalAddress1").sendKeys("567 ok street");
			 driver.findElementById("createLeadForm_generalCity").sendKeys("bombay");
			 WebElement dd1=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			 Select drpdwn1=new Select(dd1);
			 drpdwn1.selectByValue("IN");
			 driver.findElementById("createLeadForm_generalPostalCode").sendKeys("630345");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("675");
			System.out.println(s1);
			driver.findElementByClassName("smallSubmit").click();
			String title=driver.getTitle();
			if(title.equals("View Lead | opentaps CRM"))
			{
				System.out.println("right page");
			}
			else
			{
				System.out.println("fail");
			}
		 
		 
		 driver.close();
		 
		 
		
	  
		
		

	}

}
