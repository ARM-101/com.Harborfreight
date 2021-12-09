/*
package test;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.util.Base64;

public class basicauth {

    public static void main(String[] args) throws InterruptedException {

    }


    public class BasicAuthenticationTest {

        WebDriver driver;
        BrowserMobProxy proxy;

        @BeforeAll
        public static void globalSetup() {
            System.setProperty("webdriver.chrome.driver", "/Volumes/Shared/IdeaProjects/com.Harborfreight/src/test/Drivers/chromedriver");
        }

        @BeforeEach
        public void setUp() {
            setUpProxy();
            ChromeOptions ffOptions = new ChromeOptions();
            ffOptions.setProxy(ClientUtil.createSeleniumProxy(proxy));
            driver = new ChromeDriver(ffOptions);
        }

        @Test
        public void testBasicAuth() {
            driver.get("https://webelement.click/stand/basic?lang=en");
            Wait<WebDriver> waiter = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
            String greetings = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='post-body']/div/h2"))).getText();
            Assertions.assertEquals("You have authorized successfully!", greetings, "Greeting message is displayed.");
        }

        @AfterEach
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
            if (proxy != null) {
                proxy.stop();
            }
        }




        public void setUpProxy(){
            proxy = new BrowserMobProxyServer();
            try {
                String authHeader = "Basic " + Base64.getEncoder().encodeToString("webelement:click".getBytes("utf-8"));
                proxy.addHeader("Authorization", authHeader);
            } catch (UnsupportedEncodingException e) {
                System.err.println("Couldn't add authorization header..");
                e.printStackTrace();
            }
            proxy.start(0);
        }


    }
}




*/
