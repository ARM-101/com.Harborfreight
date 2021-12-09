package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alllinkscoupons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Shared/IdeaProjects/com.Harborfreight/src/test/Drivers/chromedriver");
        ChromeDriver Driver = new ChromeDriver();
        //WebDriver Driver = new ChromeDriver();
        Driver.manage().deleteAllCookies();
        //Driver.get("https://www.harborfreight.com/collections/black-friday-deals.html?limit=144");
        Driver.get("https://www.harborfreight.com/test/itc-members-coupons.html");
   /*     driver.get("https://www-stage.harborfreight.com/insidetrack/memberdeals.html");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body > div.dy-modal-container.dy-act-overlay > div.dy-modal-wrapper > div > div.dy-lb-close")).click();
        Thread.sleep(5000);
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[1]/a[1]/img")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/form/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"itc\"]")).sendKeys("2001546990");
        driver.findElement(By.name("email")).sendKeys("mchowdhury@harborfreight.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(5000);*/

        //*[@id="root"]/div[2]/div/div/div[2]/div[1]/form/div[1]/label

        //Get list of web-elements with tagName  - a
        //List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //Traversing through the list and printing its text along with link address
        //for (WebElement link : allLinks) {
        //  System.out.println(link.getText());
        // }
//        List<WebElement> anchors = driver.findElements(By.tagName("a"));
//        Iterator<WebElement> i = anchors.iterator();
//
//        while(i.hasNext()) {
//            WebElement anchor = i.next();
//            if(anchor.getAttribute("href").contains("href")) {
//                System.out.println(i);
//                anchor.click();
//                break;

        List<WebElement> link = Driver.findElements(By.tagName("a"));
        Integer i=0;

        for (WebElement ele : link) {

            String urls = ele.getAttribute("href");
            //driver.get(urls);
            //System.out.println(i);
            boolean isfound = urls.contains("ccdenc");
            if (isfound) {
                i=i+1;
                //System.out.println(urls);
                //System.out.println(i);

            }
            //Driver.get(urls);
            //Commenting driver.quit() for user to easily verify the links
            //driver.quit();
        }
        System.out.println(i);
    }
}

