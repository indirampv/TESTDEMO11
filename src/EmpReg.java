import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EmpReg extends testNG_Master {

	@Test
	public void emp_reg()
	{
		
		expected_val= f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		actual_val=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		assertEquals(actual_val, expected_val, "reg fail");
		
	}
}
