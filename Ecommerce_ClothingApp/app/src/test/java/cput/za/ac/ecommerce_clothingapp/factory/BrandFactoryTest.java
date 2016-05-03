package ac.za.factoryTest;

import ac.za.domain.Brand;
import ac.za.factory.BrandFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-04-15.
 */
public class BrandFactoryTest {


    @Test
    public void testCreateBrand() throws Exception {

        Map<String,String> values = new HashMap<String,String>();



        values.put("BrandName","Nike");


        Brand brand = BrandFactory
                .createBrand(values);

     ;
        Assert.assertEquals("Nike",brand.getBrandName());
    }

    @Test
    public void testUpdateBrand() throws Exception {



        Map<String,String> values = new HashMap<String,String>();

        values.put("BrandName","Nike");




        Brand brand = BrandFactory
                .createBrand(values);

        Brand brand1= new Brand
                .Builder()
                .copy(brand)
                .brandName("Addidas")
                .build();


        Assert.assertEquals("Addidas",brand1.getBrandName());


    }

}
