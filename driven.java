package trial_an_error;

import org.apache.poi.ss.formula.ptg.IntPtg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;

public class driven 
{
@Test
public void setup() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	Thread.sleep(3000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,450)");
	String total=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
	System.out.println("Total value"+total);
	//int a = Integer. parseInt(total); 
	
	//int a=Integer.parseInt(total, 0); 
	if(total=="$31981.41")
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("fail");
	}
}
}	
		
