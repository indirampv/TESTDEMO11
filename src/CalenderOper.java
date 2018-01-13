import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CalenderOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		String Exp_Date="19-October-2018";
		String [] Splited=Exp_Date.split("-");
		
		String month=Splited[1];
		String year=Splited[2];
		String day=Splited[0];
		
		
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		String cal_year=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		String cal_month=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		while(!year.equals(cal_year))
		{
			driver.findElement(By.className("nextMonth")).click();
			cal_year=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		}
		
		while(!month.equalsIgnoreCase(cal_month))
		{
			driver.findElement(By.className("nextMonth")).click();
			cal_month=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		}
	}

}
