package week2day2assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html"); 
		 driver.manage().window().maximize();
		 driver.findElementByXPath("//button[@id='home']").click();
		 Thread.sleep(2000);
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		WebElement position=driver.findElementByXPath("//button[@id='position']");
		Point location=position.getLocation();
		int x=location.getX();
		System.out.println(x);
		int y=location.getY();
		System.out.println(y);
		 String colr = driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getCssValue("color");
	      //getting background color attribute with getCssValue()
	     System.out.println(colr);
	     String colour=driver.findElement(By.xpath("//button[@style='background-color:lightgreen']")).getAttribute("style");
	     System.out.println(colour.replace("background-color:",""));
	     WebElement buttonlink=driver.findElementByXPath("//button[@id='size']");
	     Dimension size=buttonlink.getSize();
	     System.out.println("Width : " + size.width);
	     System.out.println("Height : "+ size.height);
	       driver.close();
	}

}
