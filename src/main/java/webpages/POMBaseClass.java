package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class POMBaseClass {
    protected ChromeDriver driver;

    public POMBaseClass(ChromeDriver driver) {
        this.driver = driver;
    }
}
