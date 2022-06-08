package utils;

public class BrowserPropertiesReader extends GenericPropertiesReader {
    public BrowserPropertiesReader(String path) {
        super(path);
    }

    public String getBrowserVersion() { return getProperty("version"); }
}
