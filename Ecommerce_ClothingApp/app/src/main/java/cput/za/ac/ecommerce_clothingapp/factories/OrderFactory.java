package ac.za.factory;

import ac.za.domain.Order;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class OrderFactory {

    private static OrderFactory instance=null;

    private OrderFactory(){}

    public static OrderFactory getInstance() {
        if (instance == null) {
            instance = new OrderFactory();

        }
        return instance;
    }

    public static Order createOrder(Map<String,Double> values,Map<String,Date> date) {

        Order order = new Order
                .Builder()
                .orderDate(date.get("orderDate"))
                .shippingDate(date.get("shippingDate"))
                .discount(values.get("discount"))
                .netAmount(values.get("netAmount"))
                .orderamount(values.get("orderAmount"))
                .shippingAmount(values.get("shippingAmount"))
                .build();
        return order;

    }
}
