package ac.za.factory;

import ac.za.domain.ProductType;

import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class ProductTypeFactory {
    private static ProductTypeFactory instance=null;

    private ProductTypeFactory(){}

    public static ProductTypeFactory getInstance() {
        if (instance == null) {
            instance = new ProductTypeFactory();

        }
        return instance;
    }

    public static ProductType createProductType(Map<String,String> value){
        return new ProductType.Builder()
                .name(value.get("name"))
                .description(value.get("description"))
                .build();


    }
}
