package ac.za.factory;

import ac.za.domain.ShoppingCart;

import java.util.Date;

/**
 * Created by Admin on 2016-04-14.
 */
public class ShoppingCartFactory {

    private static ShoppingCartFactory instance=null;

    private ShoppingCartFactory(){}

    public static ShoppingCartFactory getInstance() {
        if (instance == null) {
            instance = new ShoppingCartFactory();

        }
        return instance;
    }

    public static ShoppingCart createShoppingCart(double price,int quantity,Date created) {

        ShoppingCart cart= new ShoppingCart
                .Builder()
                .quantity(quantity)
                .price(price)
                .dateCreated(created)
                .build();
        return cart;

    }
}
