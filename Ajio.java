package Grouping;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio 
{
WebDriver driver;
@BeforeTest
void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.Ajio.com");
}
@Test(groups={"regression"})
void products()
{
 System.out.println("pass");	
}
@Test(groups= {"regression","sanity"})
void grocerious()
{
 System.out.println("fail"); 	
}
@Test(groups= {"sanity"})
void data()
{
 System.out.println("fail"); 	
}
}
