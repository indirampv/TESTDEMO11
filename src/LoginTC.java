import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTC {
	@Test
	public void LTC()
	{
	WebDriver driver=new FirefoxDriver();
	POMDemo pd=PageFactory.initElements(driver, POMDemo.class);
	driver.get(pd.url);
	driver.manage().window().maximize();
	pd.login(pd.name, pd.pssword);
}
}