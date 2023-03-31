package Task_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class naukari 
{
	WebDriver driver;
@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.naukri.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}
@Test(dataProvider = "dp")
public void Login(String email,String pass) throws InterruptedException
{
	driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
	WebElement user = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
	user.sendKeys(email);
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys(pass);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();

	
}
@Test(dependsOnMethods = "Login")
public void logout()
{
	driver.findElement(By.xpath("((//a[.='Companies']/../../../..//div[3])[2]//div[2])[1]/../..")).click();
	driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();
}
@AfterClass
void z_exit()
{
	driver.quit();
}
@DataProvider(name="dp")
String[][] data()
{
	String[][]dataa={
			{"nagaraj","93803"},
			{"rajmannale@gmail.com","425263"},
			{"rajmannale@gmail.com","Nagu@123"},
			
	                };
	return dataa;
			
	}

}




