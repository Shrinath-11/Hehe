import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoXpath {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Login Into Site
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	
	String t=driver.findElement(By.xpath("//span[text()='Admin']/parent::a")).getText();
	System.out.println(t);
	
	
	
	
	
	
		
	}

}
