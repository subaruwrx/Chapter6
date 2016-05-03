package ac.za.factoryTest;

import ac.za.domain.Attributes;
import ac.za.factory.AttributesFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class AttributeFactoryTest {

    @Test
    public void testCreateAttribute() throws Exception {

        Map<String,String> values = new HashMap<String,String>();


        values.put("attributeName","color");
        values.put("attributeValue","red");
        values.put("description","by jordan nike sneakers");



        Attributes attributes= AttributesFactory
                .createAttributes(values);


        Assert.assertEquals( "by jordan nike sneakers",attributes.getDescription());
        Assert.assertEquals("color",attributes.getAttributeName());
        Assert.assertEquals("red",attributes.getAttributeValue());

    }

    @Test
    public void testUpdateAttributes() throws Exception {


        Map<String,String> values = new HashMap<String,String>();


        values.put("attributeName","color");
        values.put("attributeValue","red");
        values.put("description","by jordan nike sneakers");



        Attributes attributes= AttributesFactory
                .createAttributes(values);

        Attributes attributes1= new Attributes
                .Builder()
                .copy(attributes)
                .attributeName("size")
                .attributeValue("8 UK")
                .description("by Kanye addidas sneakers")
                .build();



        Assert.assertEquals( "by Kanye addidas sneakers",attributes1.getDescription());
        Assert.assertEquals("size",attributes1.getAttributeName());
        Assert.assertEquals("8 UK",attributes1.getAttributeValue());




    }


}
