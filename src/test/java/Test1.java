import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

                String url = ("https://www.google.com/");
        driver.get(url);
        String title = driver.getTitle();
        int titleLength = driver.getTitle().length();
        System.out.println("Title of the page is : " + title);
        System.out.println("Length of the title is : "+ titleLength);

        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Total length of the Pgae Source is : " + pageSourceLength);

    }
}
