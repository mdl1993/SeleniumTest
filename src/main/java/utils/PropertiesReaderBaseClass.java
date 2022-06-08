package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderBaseClass {
    private Properties prop;
    private String path;

    protected PropertiesReaderBaseClass(String path) {
        prop = new Properties();
        this.path = path;
    }

    protected String getProperty(String property) {
        try {
            prop.load(new FileInputStream(path));
            return prop.getProperty(property);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}