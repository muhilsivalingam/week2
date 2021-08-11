package seleniumweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login"); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByXPath("//a[text()='Contacts']").click();
		 driver.findElementByXPath("//a[text()='Create Contact']").click();
		 driver.findElementById("firstNameField").sendKeys("create");
		 driver.findElementById("lastNameField").sendKeys("contact");
		 driver.findElementById("createContactForm_firstNameLocal").sendKeys("createlocal");
		 driver.findElementById("createContactForm_lastNameLocal").sendKeys("contactlocal");
		driver.findElementById("createContactForm_departmentName").sendKeys("selenium");
		driver.findElementById("createContactForm_description").sendKeys("contact detailsfdfdffffyfyfyguyguguyguggggggggg");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("mail@mail.com");
		WebElement dd=driver.findElementByName("generalStateProvinceGeoId");
		Select drop=new Select(dd);
		drop.selectByVisibleText("New York");
		driver.findElementByXPath("//input[@value='Create Contact']").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("important notes for vcreate contact");
		driver.findElementByXPath("//input[@value='Update']").click();
		System.out.println(driver.getTitle());
		
		
		 
		 
		
	}

}
