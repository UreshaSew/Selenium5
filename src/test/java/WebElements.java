import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.navigate().to("https://www.facebook.com/?stype=lo&jlou=AfeDPAbxrKdO8_1JTFfLabVmKMAgWNpSaQw2pDw7HUJ01jSjJvdf3xT_daxERvsygggJr5X6REs3_CWZ4vvfYKb8azJOjHB67O7voYDlmSirFQ&smuh=10842&lh=Ac-Rh2KfIMqkiQ0E");
//        //driver.findElement(By.id("email")).sendKeys("vpusewwandi@gmail.com");
//        //driver.findElement(By.id("pass")).sendKeys("uresha19");
//        //driver.findElement(By.id("loginbutton")).click();
//        WebElement element = driver.findElement(By.id("loginbutton"));
//        Dimension dimensions = element.getSize();
//        System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);
//        //boolean s = driver.findElement(By.id("email")).isDisplayed();
//       // boolean  b = driver.findElement(By.id("pass")).isDisplayed();
//        driver.close();

        //driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        // driver.findElement(By.id("male")).click();
        driver.navigate().to("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("#ctl00_mainContent_SeniorCitizenDiv > label")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());





    }
}
