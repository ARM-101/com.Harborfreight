package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class contactus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/shared/git/com.Harborfreight/src/test/Drivers/chromedriver");
        ChromeOptions op = new ChromeOptions();
       // op.addExtensions(new File("/Volumes/shared/git/com.Harborfreight/src/test/Drivers/Auth.crx"));
        ChromeDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(991, 1100));
        
        // driver.get("https://www-stage.harborfreight.com");
        driver.get("https://www.harborfreight.com");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //click on pop-up
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]")).click();
        
        String Strlctr = driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[1]/span/p[2]")).getText();
        System.out.println(Strlctr);
        
        String HdrAcount = driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[2]/span/span")).getText();
        System.out.println(HdrAcount );
        
        String Hdrlblfndstr = driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[3]/a")).getText();
        System.out.println(Hdrlblfndstr);
        
        String HdrlblMyList = driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[4]/a")).getText();
        System.out.println(HdrlblMyList);
        
        String HdrlblMyCart = driver.findElement(By.xpath("//*[@id=\"topBar\"]/div/div[5]/a/span")).getText();
        System.out.println(HdrlblMyCart);
        
        String lblAllDept = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[1]")).getText();
        System.out.println(lblAllDept);
        
        String lblDeals = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[1]/a")).getText();
        System.out.println(lblDeals);
        
        //New deals 
        String lblNewDeals = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[2]/a")).getText();
        System.out.println(lblNewDeals);
        
        //Members deals  
        String lblmDeals = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[2]/a")).getText();
        System.out.println(lblmDeals);
        
        //Join Inside  Track club  
        String lblInTrCl = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[4]/a")).getText();
        System.out.println(lblInTrCl);
        
        //Credit 
        WebElement ImgCredit = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[5]/a/img"));
        Boolean ImageCredit = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImgCredit);
        if (!ImageCredit)
        {
             System.out.println("Credit card image not displayed.");
        }
        else
        {
            System.out.println("Credit card image is  displayed.");
        }
        
      
        //String lblCredit = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[5]/a/text()")).getText();
        //System.out.println(lblInTrCl);
        
        //Locating Harborfreight logo
        WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"logoRow\"]/span/img"));
        
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Harborfreight Logo is not displayed.");
        }
        else
        {
            System.out.println("Harborfreight Logo is  displayed.");
        }
        
        driver.quit();
	}

	

}
