package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleWebPage extends WebPageBaseClass {

    @FindBy(id = "input")
    private WebElement googleInput;
    @FindBy(id = "L2AGLb")
    private WebElement button;

    public GoogleWebPage(ChromeDriver driver) {
        super(driver);
    }

    public WebElement getGoogleInput() {
        return googleInput;
    }

    public WebElement getButton() {
        return button;
    }

    public void clickAccept() {
        getButton().click();
    }

    public void sendText(String text) {
        getGoogleInput().sendKeys(text);
        getGoogleInput().click();
    }
}
