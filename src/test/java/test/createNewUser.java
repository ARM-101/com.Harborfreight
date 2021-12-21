package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createNewUser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/shared/git/com.Harborfreight/src/test/Drivers/chromedriver");
        ChromeOptions op = new ChromeOptions();
       // op.addExtensions(new File("/Volumes/shared/git/com.Harborfreight/src/test/Drivers/Auth.crx"));
        ChromeDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        
        // driver.get("https://www-stage.harborfreight.com");
        driver.get("https://www.harborfreight.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //click on pop-up
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]")).click();
        
       //clicking on MyAccount link in the header
      //driver.findElement(By.xpath("//div/div[2]/span/span")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/span/span")).click();
      
      //click on create new account
      driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/div/p/a")).click();
      
      driver.findElement(By.name("firstname")).sendKeys("Kathy");
      driver.findElement(By.name("lastname")).sendKeys("Lee");
      driver.findElement(By.name("email")).sendKeys("klee2@gmail.com");
      driver.findElement(By.name("password")).sendKeys("Password123!");
      driver.findElement(By.name("confirmation")).sendKeys("Password123!");
      driver.findElement(By.name("postcode")).sendKeys("91377");
     
      driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[1]/form/button")).click();
      
      String Ordertxt = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div/h2")).getText();
      String ExpectedOrdertxt = "My Orders";
      Assertions.assertEquals(Ordertxt, ExpectedOrdertxt);
      
      System.out.println(Ordertxt);
      driver.quit();
      

	}

}
