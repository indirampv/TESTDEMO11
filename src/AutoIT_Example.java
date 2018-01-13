import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class AutoIT_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driv= new FirefoxDriver();
driv.get("http://www.seleniumhq.org/download/");
driv.manage().window().maximize();

driv.findElement(By.linkText("3.3.1")).click();

Sleeper.sleepTightInSeconds(5);

Runtime.getRuntime().exec("C:\\Users\\Hemchand\\Desktop\\eds33.exe");
	}

}
