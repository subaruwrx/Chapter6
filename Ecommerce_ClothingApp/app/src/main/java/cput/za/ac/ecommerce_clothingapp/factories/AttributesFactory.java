package ac.za.factory;

import ac.za.domain.Attributes;

import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class AttributesFactory {

    private static AttributesFactory instance=null;

    private AttributesFactory(){}

    public static AttributesFactory getInstance() {
        if (instance == null) {
            instance = new AttributesFactory();

        }
        return instance;
    }



    public static Attributes createAttributes(Map<String,String> values) {
        Attributes attributes = new Attributes
                .Builder()
                .attributeName(values.get("attributeName"))
                .attributeValue(values.get("attributeValue"))
                .description(values.get("description"))
                .build();
        return attributes;

    }
}
