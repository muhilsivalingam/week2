package week2day2assign1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();         
		ChromeDriver driver = new ChromeDriver();         
		driver.get("http://www.leafground.com/pages/checkbox.html"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following-sibling::div/input)[1]").click();
		boolean a=driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::div/input").isSelected();
		System.out.println(a+" selenium is checked");
		
		WebElement one=driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[1]");
		WebElement two=driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]");
		boolean b=one.isSelected();
		boolean c=two.isSelected();
		
		if(b)
		{
			driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[1]").click();
		}
		else if(c)
		{
			driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]").click();
		}
		
		List<WebElement> checkboxes=driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
		for(WebElement count:checkboxes)
		{
			count.click();
		}
		
	}
	
	
	

}
