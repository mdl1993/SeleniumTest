package deviceclassification;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserDevice extends AbstractDevice {
    public BrowserDevice(DesiredCapabilities desiredCapabilities,  int deviceId) {
        super(desiredCapabilities, deviceId);
    }
}
