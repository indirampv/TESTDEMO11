import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class UploadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
driver.get("https://www.freepdfconvert.com/pdf-word");
driver.manage().window().maximize();

driver.findElement(By.id("clientUpload")).click();
Sleeper.sleepTightInSeconds(5);

//Actions act= new Actions(driver);

Runtime.getRuntime().exec("C:\\Users\\Hemchand\\Desktop\\upload.exe");

	}

}
