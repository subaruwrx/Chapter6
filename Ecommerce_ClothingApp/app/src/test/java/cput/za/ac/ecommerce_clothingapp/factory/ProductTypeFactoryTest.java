package ac.za.factoryTest;

import ac.za.domain.ProductType;
import ac.za.factory.ProductTypeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class ProductTypeFactoryTest {

    @Test
    public void testCreateProductType() throws Exception {


        Map<String,String> values = new HashMap<String,String>();

        values.put("name","Nike");
        values.put("description","by jordan");

        ProductType type = ProductTypeFactory
                .createProductType(values);


        Assert.assertEquals( "by jordan",type.getDescription());
        Assert.assertEquals("Nike",type.getName());

    }

    @Test
    public void testUpdateProductType() throws Exception {


        Map<String,String> values = new HashMap<String,String>();

        values.put("name","Addidas");
        values.put("description","by kanye");

        ProductType type = ProductTypeFactory
                .createProductType(values);
        ProductType type1 = new ProductType
                .Builder()
                .copy(type)
                .name("Nike")
                .description("by jordan")
                .build();



        Assert.assertEquals( "by jordan",type1.getDescription());
        Assert.assertEquals("Nike",type1.getName());

    }

}
