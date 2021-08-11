package week2day2assign1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementById("no").click();
	boolean a=driver.findElementByXPath("//label[@for='Checked']/input").isSelected();
		boolean b=driver.findElementByXPath("//label[@for='Unchecked']/input").isSelected();
		if(b)
		{
			System.out.println("default selected-Checked");
		}
		else if(a)
	{
		System.out.println("default selected-UnChecked");
			
		}
		
		System.out.println(a+" "+b);
		
	//3---how to find unique locator/xpath for default selacted -age here?
	
		
		boolean d=driver.findElementByXPath("(//input[@value='0'])[3]").isSelected();
		boolean e=driver.findElementByXPath("//input[@value='2']").isSelected();		
		boolean c=driver.findElementByXPath("(//input[@value='1'])[3]").isSelected();
			
		if(c)
		{
			System.out.println("21 to 40 years--No need to change the choice");
		}
		else if(d)
	
		{
			System.out.println(" need to change the choice");
		}
		else if(e)
		{
			System.out.println(" need to change the choice");
		}
		
	}

}
