package devicebuilder;

import deviceclassification.BrowserDevice;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.BrowserPropertiesReader;

public class BrowserBuilder extends AbstractDeviceBuilder {
    DesiredCapabilities desiredCapabilities;
    String browserVersion;

    public BrowserBuilder(BrowserPropertiesReader browserPropertiesReader) {
        super(browserPropertiesReader);
        desiredCapabilities = new DesiredCapabilities();
    }

    public BrowserBuilder setPlatformName() {
        browserVersion = ((BrowserPropertiesReader) devicePropertiesReader).getBrowserVersion();
        desiredCapabilities.setBrowserName(browserVersion);
        return this;
    }

    public BrowserDevice build() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        return new BrowserDevice(desiredCapabilities, devicePropertiesReader.getDeviceId());
    }
}
