package utils;

public class GenericPropertiesReader extends PropertiesReaderBaseClass {
    public GenericPropertiesReader(String path) {
        super(path);
    }

    public String getType() {return getProperty("type");}
    public int getDeviceId() {return Integer.parseInt(getProperty("deviceId"));}
}
