
package automation_testing_assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Automation_Testing_Assignment {

    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoja\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = (WebDriver) new ChromeDriver();
          driver.get("http://automationpractice.com");
         driver.manage().window();
         // driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span")).click();
        Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
      Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[2]/span")).click();
     
     driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
           Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
           Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();  
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
    driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();  
    Select sell = new Select(driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]")));
    sell.selectByIndex(1);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
    
    
         driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span/i")).click();
           Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span/i")).click();
           Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span/i")).click();
           Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span/i")).click();
           Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
           Thread.sleep(5000);
         driver.quit();
                 }

   
}
