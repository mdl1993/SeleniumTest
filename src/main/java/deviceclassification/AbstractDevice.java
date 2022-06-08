package deviceclassification;

import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class AbstractDevice {
    int deviceId;
    DesiredCapabilities desiredCapabilities;

    public AbstractDevice(DesiredCapabilities desiredCapabilities, int deviceId) {
        this.desiredCapabilities = desiredCapabilities;
        this.deviceId = deviceId;
    }

    public DesiredCapabilities getDesiredCapabilities() {
        return desiredCapabilities;
    }

    public int getDeviceId() {
        return deviceId;
    }
}
