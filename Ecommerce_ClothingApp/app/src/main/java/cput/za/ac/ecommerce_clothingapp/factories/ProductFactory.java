package ac.za.factory;

import ac.za.domain.Product;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class ProductFactory {

    private static ProductFactory instance=null;

    private ProductFactory(){}

    public static ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();

        }
        return instance;
    }

    public static Product createProduct(Map<String,Double> mydouble, Map<String,String> values,int quantity) {

        return new Product.Builder()
                .originalPrice(mydouble.get("originalPrice"))
                .salePrice(mydouble.get("salePrice"))
                .description(values.get("description"))
                .productName(values.get("productName"))
                .productQuantity(quantity)
                .productType(values.get("productType"))
                //.image(image.get("symbolImage"))
                .build();


    }
}
