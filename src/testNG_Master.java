import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class testNG_Master {

	
public WebDriver driver;
public String url="http://opensource.demo.orangehrmlive.com/";
public String expected_val,actual_val;
public String u="Admin", p="admin", f= "indin111", l="prm1111";
@BeforeSuite
public void launchbr()
{
	expected_val="LOGIN";
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	actual_val=driver.findElement(By.id("btnLogin")).getAttribute("value");
	assertEquals(actual_val, expected_val, "failed launch");
}

@AfterSuite
public void close()
{
driver.close();	
}

@BeforeClass

public void LoginMeth()
{
	expected_val="welcome";
driver.findElement(By.id("txtUsername")).sendKeys(u);	
driver.findElement(By.id("txtPassword")).sendKeys(p);
driver.findElement(By.id("btnLogin")).click();
actual_val=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
assertEquals(actual_val, expected_val, "failed launch");

}

	
@AfterClass

public void Logout()
{
	expected_val="LOGIN";
	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
	actual_val=driver.findElement(By.id("btnLogin")).getAttribute("value");
	assertEquals(actual_val, expected_val, "failed login");

}
}