package Task_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kml 
{
WebDriver driver;
@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/d/edit?hl=en&mid=1GnLo8qeQUS85iVk1Y64LrVOH46ZAyso&ll=15.854161601052223%2C82.75998700000002&z=4");
	driver.manage().window().maximize();	
}
@Test
public void signin() throws AWTException, InterruptedException
{
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nagaraj@active.agency");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Nagu@123");
	Robot rt=new Robot();
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[.='Import'])[1]")).click();
    Thread.sleep(3000);
    driver.switchTo().frame("-1");
    Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[.='Select a file from your device'])[2]")).sendKeys("\\home\\active35\\Downloads\\kml file (1).kml");
}
}
