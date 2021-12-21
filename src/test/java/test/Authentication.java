package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class Authentication {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/Volumes/shared/git/com.Harborfreight/src/test/Drivers/chromedriver");
        ChromeOptions op = new ChromeOptions();
       // op.addExtensions(new File("/Volumes/shared/git/com.Harborfreight/src/test/Drivers/Auth.crx"));
        ChromeDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
		/*
		 * driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/popin.html");
		 * 
		 * 
		 * driver.findElement(By.id("url")).sendKeys(
		 * "https://www-stage.harborfreight.com");
		 * //driver.findElement(By.id("url")).sendKeys("https://www.harborfreight.com");
		 * driver.findElement(By.id("username")).sendKeys("stage");
		 * driver.findElement(By.id("password")).sendKeys("Sup3rs3cr3t#!");
		 * driver.findElement(By.id("priority")).sendKeys("1");
		 * driver.findElement(By.xpath("//button[.='Add']")).click();
		 * 
		 * driver.findElement(By.id("url")).sendKeys(
		 * "https://api-stage.harborfreight.com");
		 * //driver.findElement(By.id("url")).sendKeys(
		 * "https://stage-shop.harborfreight.com");
		 * driver.findElement(By.id("username")).sendKeys("stage");
		 * driver.findElement(By.id("password")).sendKeys("Sup3rs3cr3t#!");
		 * driver.findElement(By.id("priority")).sendKeys("2");
		 * driver.findElement(By.xpath("//button[.='Add']")).click();
		 */


       // driver.get("https://www-stage.harborfreight.com");
        driver.get("https://www.harborfreight.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //click on pop-up
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]")).click();
        //driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]))
        //driver.findElement(By.xpath("//div[4]/div[2]/div/div[1]")).click();
        
        //clicking on MyAccount link in the header
        //driver.findElement(By.xpath("//div/div[2]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/span/span")).click();
        ////*[@id="topBar"]/div/div[2]/span/span
        //#topBar > div > div.my-account__myAccount--1-m562.hidden-mobile > span > span
        
        //click on SignIn button
        driver.findElement(By.xpath("//div/div[2]/div/a")).click();



        //entering username, password and click on Sign in button
        driver.findElement(By.id("login-email")).sendKeys("amamilapally@harborfreight.com");
        driver.findElement(By.id("login-password")).sendKeys("Password098!");
        driver.findElement(By.xpath("//div[2]/div/div/div[2]/div/div[1]/form/div[3]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //click on track order

        String Ordernumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/ul/li[2]/a")).getText();
        System.out.println(Ordernumber);
        
      //click on user name in header
        driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/span/span")).click();
      
      //signout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/div/ul/li[8]/span")).click();
      System.out.println("User Signed out Successfully");
      driver.quit();
        
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/button/i")).click();

        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/a")).click();






    }

}
