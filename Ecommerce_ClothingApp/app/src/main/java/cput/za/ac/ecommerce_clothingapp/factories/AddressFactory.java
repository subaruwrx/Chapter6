package ac.za.factory;

import ac.za.domain.Address;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class AddressFactory {



    private static AddressFactory instance=null;

    private AddressFactory(){}

    public static AddressFactory getInstance() {
        if (instance == null) {
            instance = new AddressFactory();

        }
        return instance;
    }



    public static Address createAddress(Map<String,String> values) {
        Address address= new Address
                .Builder()
                .city(values.get("city"))
                .country(values.get("country"))
                .street(values.get("street"))
                .zipCode(values.get("zipCode"))
                .build();
        return address;

    }


}
