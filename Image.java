package week2day2assign1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Image.html");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElementByXPath("//img[@alt='logo Testleaf']").click();
	 driver.navigate().back();
	String broke=driver.findElementByXPath("//img[@src='../images/abcd.jpg']").getAttribute("src");
	driver.get(broke);
	String title=driver.getTitle();
	{
		if(title.contains("404"))
		{
			System.out.println("image is broken");
		}
	}
	driver.navigate().back();
	driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
	System.out.println("keyboard image is clicked");
	

}
}
