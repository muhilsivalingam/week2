package week2day2assign1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dd1=driver.findElementById("dropdown1");
		Select dropdown1=new Select(dd1);
		dropdown1.selectByIndex(1);
		WebElement dd2=driver.findElementByName("dropdown2");
		Select dropdown2=new Select(dd2);
		dropdown2.selectByVisibleText("Appium");
		WebElement dd3=driver.findElementById("dropdown3");
		Select dropdown3=new Select(dd3);
		dropdown3.selectByValue("3");
		WebElement dd4=driver.findElementByClassName("dropdown");
		Select dropdown4=new Select(dd4);
		System.out.println(dropdown4.getOptions().size());
		driver.findElementByXPath("(//div[@class='example']/select)[5]").sendKeys("Loadrunner");
		driver.findElementByXPath("(//option[text()='Select your programs']/following-sibling::option)[2]").click();
		
		
		
		
	}

}
