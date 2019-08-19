import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Test2 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // slecting dropdowns

//        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
//        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
//        dropdown.selectByVisibleText("Database Testing");

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        // keep waiting time
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




        // drag and drop ----- but it is't working
WebElement from = driver.findElement(By.id("sourceImage"));
WebElement to = driver.findElement(By.id("targetDiv"));
 Actions a = new Actions(driver);
a.dragAndDrop(from, to).build().perform();
    }
}
