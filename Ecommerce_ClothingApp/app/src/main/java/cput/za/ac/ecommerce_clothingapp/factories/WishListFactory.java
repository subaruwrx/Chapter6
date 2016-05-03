package ac.za.factory;

import ac.za.domain.WishList;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-05-02.
 */
public class WishListFactory {

    private static WishListFactory instance=null;

    private WishListFactory(){}

    public static WishListFactory getInstance() {
        if (instance == null) {
            instance = new WishListFactory();

        }
        return instance;
    }

    public static WishList createWishList(String name, Date insertDate) {
        WishList wishList= new WishList
                .Builder()
                .name(name)
                .insertDate(insertDate)
                .build();
        return wishList;

    }
}

