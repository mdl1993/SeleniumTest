package googleTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import webpages.GoogleWebPage;

import java.util.concurrent.TimeUnit;

public class GoogleWebPageTest {
    private GoogleWebPage googleWebPage;
    private ChromeDriver driver;
    protected final String pageURL = "http://www.google.com/";


    @Test
    public void verifyResponse(){
        System.setProperty("webdriver.chrome.driver",
                "E:\\IdeaProjects\\SeleniumTest\\src\\main\\resources\\driver\\chromedriver.exe");
        driver =  new ChromeDriver(new ChromeOptions()
                .addArguments("user-data-dir=C:\\Users\\mdilegge\\AppData\\Local\\Google\\Chrome\\User Data\\Default")
                .addArguments("start-maximized")
                .addArguments("--no-sandbox")
                .addArguments("--disable-dev-shm-usage"));
        googleWebPage = PageFactory.initElements(driver, GoogleWebPage.class);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(pageURL);
        googleWebPage.sendText(pageURL);
        System.out.println("fatt");

    }


}
