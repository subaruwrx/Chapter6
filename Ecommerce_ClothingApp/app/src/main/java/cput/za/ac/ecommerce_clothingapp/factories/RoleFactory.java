package ac.za.factory;

import ac.za.domain.Role;

import java.util.Map;

/**
 * Created by Admin on 2016-05-02.
 */
public class RoleFactory {

    private static  RoleFactory instance=null;

    private RoleFactory(){}

    public static RoleFactory getInstance() {
        if (instance == null) {
            instance = new RoleFactory();

        }
        return instance;
    }

    public static Role createRole(Map<String,String> value){
        return new Role.Builder()
                .role(value.get("role"))
                .description(value.get("description"))
                .build();


    }
}
