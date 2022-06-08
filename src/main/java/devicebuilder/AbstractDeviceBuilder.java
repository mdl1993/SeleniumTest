package devicebuilder;


import utils.GenericPropertiesReader;

public abstract class AbstractDeviceBuilder {
    GenericPropertiesReader devicePropertiesReader;

    public AbstractDeviceBuilder(GenericPropertiesReader genericPropertiesReader) {
        devicePropertiesReader = genericPropertiesReader;
    }
}
