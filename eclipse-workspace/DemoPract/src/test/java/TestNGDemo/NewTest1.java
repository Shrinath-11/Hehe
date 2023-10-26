package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	WebDriverWait wait;
  @Test (priority = 0)
  public void f() {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.oracle.com/in/");
	  driver.manage().window().maximize();
	  
  }
  @Test (priority = 1)
  public void f2() {
	  driver.findElement(By.xpath("//*[@id='industries1']")).click();
	  driver.findElement(By.xpath("//*[@id=\"industries\"]/li[13]/a")).click();
  }
  
  @Test (priority = 2)
  public void f3() throws Exception{
	  Thread.sleep(3000);
	  driver.close();
  }
}
