package webpages;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageBaseClass extends POMBaseClass {
    String pageURL;

    public WebPageBaseClass(ChromeDriver driver) {
        super(driver);
    }
}
