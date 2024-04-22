package testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrikanTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        String username= "vasu@orikan.com";
        String password= "vasu@123";
        String fname= "vasu";
        
        
		WebDriver driver = new ChromeDriver();
        driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
       
        
        
		driver.findElement(By.id("emailAddress")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-register-wizard/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lname);
		driver.findElement(By.id("addressLine1")).sendKeys("Parklane Street");
		driver.findElement(By.id("addressLine2")).sendKeys("100 Block");
		driver.findElement(By.id("postcode")).sendKeys("500087");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		
	    
	    
	  
	    
	}

}
