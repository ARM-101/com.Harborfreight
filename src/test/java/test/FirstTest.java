package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.network.Network;
import org.openqa.selenium.devtools.v95.network.model.Headers;
import org.openqa.selenium.remote.SessionId;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Shared/IdeaProjects/com.Harborfreight/src/test/Drivers/chromedriver");
        //WebDriver Driver= new ChromeDriver();
        ChromeDriver Driver = new ChromeDriver();
        //String URL = "https:// + stage + ":" + Sup3rs3cr3t#! + "@" + "www-stage.harborfreight.com";
        Driver.manage().deleteAllCookies();
        System.out.println("----Cleared Cookies --- opening  www.harborfreight.com");
        Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Authentication username & password
        String username = "stage";
        String password = "Sup3rs3cr3t#!";

        // Get the devtools from the running driver and create a session
        DevTools devTools = Driver.getDevTools();
        devTools.createSession();

        // Enable the Network domain of devtools
        devTools.send(Network.enable(Optional.of(100000), Optional.of(100000), Optional.of(100000)));
        String auth = username + ":" + password;

        // Encoding the username and password using Base64 (java.util)
        String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());

        // Pass the network header -> Authorization : Basic <encoded String>
        Map<String, Object> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + encodeToString);
         SessionId Sess = Driver.getSessionId();
                System.out.println(Sess);

        devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
        devTools.createSession();



        // Load the application url
        Driver.get("https://www-stage.harborfreight.com/customer/account/login");

        //headers.put("Authorization", "Basic " + encodeToString);
        //Driver.navigate().to("https://www-stage.harborfreight.com");

        Thread.sleep(10000);
        Driver.findElement(By.cssSelector("body > div.dy-modal-container.dy-act-overlay > div.dy-modal-wrapper > div > div.dy-lb-close")).click();

        Driver.findElement(By.id("login-email")).sendKeys("amamilapally@harborfreight.com");
        Driver.findElement(By.id("login-password")).sendKeys("Password123!");
        //Driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div[1]/form/div[3]/button[1]")).click();
        Driver.findElement(By.cssSelector("#root > div.base__content--3BcMPK > div > div > div.customer__myAccountMain--1XymxK > div > div.login__signInWrap--30CV9q.login-signup-wrap > form > div.login__buttonLinkWrap--YyYU4M > button.button__button--lXvrDY.buttonPrimary.button__buttonPrimary--8n7k9w")).click();
        //Driver.get("https://www-stage.harborfreight.com");
        /*Driver.getDevTools().getDomains();
        Driver.findElement(By.xpath("//*[@id=\"logoRow\"]/span/img")).click();
        //Driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/ul/li[2]/ul/li[1]/a")).click();*/


    }
}
