import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
//driver.findElement(By.id("dblClkBtn")).click();
//        Actions action = new Actions(driver);
//       WebElement link =driver.findElement(By.id("dblClkBtn"));
//        action.doubleClick(link).perform();

        //<------------handling alerts..................>

  //driver.findElement(By.xpath("/html/body/div/div[12]/div/p[1]/button")).click();
  driver.findElement(By.linkText("Generate Alert Box")).click();
 // driver.switchTo().alert().dismiss();
driver.switchTo().alert().accept();
    }
}
