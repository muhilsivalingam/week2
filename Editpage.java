package week2day2assign1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		 driver.get("http://leafground.com/pages/Edit.html"); 
		 driver.manage().window().maximize();
		 driver.findElementByXPath("//input[@id='email']").sendKeys("choco@rediffmail.com");
		 WebElement append=driver.findElementByXPath("//input[@value='Append ']");
		 append.sendKeys("additionaltext");
		 append.sendKeys(Keys.TAB);
		 driver.findElementByXPath("//input[@value='TestLeaf']").getText();
		 driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		 WebElement editfield=driver.findElementByXPath("//input[@disabled='true']");
		 boolean x=editfield.isEnabled();
		 if(x)
		 {
			System.out.println("enabled-editable"); 
		 }
		 else
		 {
			 System.out.println("disabled-non-editable");
		 }

}
}
