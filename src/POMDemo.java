import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class POMDemo {

	 public  static String name = "mindira89";
	 public static String pssword = "9502162247";
	 public String url="http://www.facebook.com";
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	
	@FindBy(xpath=".//*[@id='loginbutton']")
	WebElement button_click;
	
	
	public void login(String name, String pssword)
	{
		
		username.sendKeys(name);
		password.sendKeys(pssword);
		button_click.click();
	}
}

